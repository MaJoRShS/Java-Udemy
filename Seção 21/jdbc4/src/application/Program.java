package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {

		/*
		 * Aqui é padrão ele ta instanciando a conexão,e e preparando a query na mão ai
		 * depois ele pega os valores usando os esquemas de prepareStatement e executa,
		 * ai como tudo no JAVA é muito verboso e trabalhoso é necessario fechar tudo
		 * que tu abriu.
		 */
		Connection conn = null;
		PreparedStatement st = null;
		try {

			conn = DB.getConnection();

			st = conn.prepareStatement(
					"UPDATE seller " + "SET BaseSalary = BaseSalary + ? " + "WHERE " + "(DepartmentId = ?)");

			st.setDouble(1, 200.0);
			st.setInt(2, 2);

			int rowsAffected = st.executeUpdate();

			System.out.println("Done! Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}