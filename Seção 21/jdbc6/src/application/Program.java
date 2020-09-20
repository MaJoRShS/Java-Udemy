package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;

		// Aqui ele criou um statment mesmo ao invés de um preparedStatment, porque ele
		// passou a query diretamente
		Statement st = null;
		try {
			conn = DB.getConnection();

			// Esse cara é para ele não dar o auto commit em operações unicas e que ainda
			// não finalizaram a sua transação.
			conn.setAutoCommit(false);

			// esse é o comando para criar a query que vai ser executada
			st = conn.createStatement();

			// e aqui ele executa a query que ele criou antes e joga o resultado em uma
			// variavel
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

			/*
			 * esse cara aqui era um teste para mostrar que quando uma transação dava erro
			 * no meio mesmo assim ele ainda commitava o que ele já tinha feito, e deixava o
			 * resto das intruções sem execução.
			 */

			// int x = 1;
			// if (x < 2) {
			// throw new SQLException("Fake error");
			// }

			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

			/*
			 * como agora sim estamos trabalhando com trasação aqui tem que setar o commit
			 * se não ele não commit o que foi feito.
			 */
			conn.commit();

			System.out.println("rows1 = " + rows1);
			System.out.println("rows2 = " + rows2);
		} catch (SQLException e) {
			/*
			 * Como o comando rollback pode dar erro também é necessario usar um trycatch
			 * para ele também, por isso tem um trycatch dento do catch
			 */
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
