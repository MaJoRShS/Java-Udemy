package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		/*
		 * Aqui ele seta todas as info do cliente e já instancia o proprio
		 */
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		// Aqui ele seta o OrderStatus, do tipo OrderStatus com o valor informado pelo
		// usuario.
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		/*
		 * Aqui no ORDER ele passa de parâmetro uma nova data que ele pegou na hora da
		 * criação do objeto, ai ele passa o status que ele gerou ali em cima no
		 * OrderStatus ai passa já o objeto cliente também como parâmetro, fazendo assim
		 * a composição dos objetos.
		 */
		Order order = new Order(new Date(), status, client);

		/*
		 * Aqui ele faz um contador para poder pegar a quantidade de produtos e fazer
		 * uma iteração para cada produto.
		 * 
		 * Mano essa porra me confunduiu legal, acho que preciso voltar a brincar com
		 * orientação a objeto e fazer mais exercicios de JAVA, com lista, matriz e a
		 * porra toda acho que não da mais para ficar perdendo tempo com LOL, pelo menos não por enquanto.
		 */
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();

			Product product = new Product(productName, productPrice);

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(quantity, productPrice, product);

			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		sc.close();
	}
}
