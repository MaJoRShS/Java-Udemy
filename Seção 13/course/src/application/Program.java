package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		/*
		 * Aqui tem uma parada mesmo que você tenha definido que é um enum(status) ele
		 * vai tranformar esse enum em string para poder devolver no console.
		 */
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		/*
		 * Aqui eu estou convertendo uma string para um tipo enum para poder gravar o
		 * tipo certo na hora de gravar esse status ou para não dar conflito porque o
		 * tipo que ele é criado é enum se eu mandar um string ele vai dar conflito de
		 * tipos.
		 * 
		 */
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(os1);
		System.out.println(os2);
	}

}
