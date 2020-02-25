package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.enums.OrderStatus;

public class Order {

	// Aqui ele mesmo formatou a data que ele queria no moment.
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;

	/*
	 * isso aqui eu não tinha feito, não sabia nem por onde começar, tenho que ver
	 * melhor essa parada de Composição de classe.
	 * 
	 * 
	 * mais basicamente ele tem um cliente do tipo cliente como parametro da classe,
	 * e também uma lista de Item do tipo OrderItem, ai já mandou ela como arrayList
	 * para poder trabalar com ela
	 */
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	// eu não tinha pensado em passar o cliente aqui na construção do ORDER.
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	// Aqui aquele esquema que como ele está passando uma lista ele não vai permitir
	// que criem uma nova.
	public List<OrderItem> getItems() {
		return items;
	}

	// Aqui como é um arrayList ele consegue usar o add e o remove do ArrayList
	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	/*
	 * aqui ele instancia uma variavel com 0.0 para não dar erro nem quebrar nada,
	 * ai ele vai e faz um for para somar cada subtotal que existir e já trazer o
	 * valor total dos items do piao
	 */
	public double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	
	/*
	 * Aqui já usando a parada do StringBuilder que ele mostrou aula passada para formatar tudo e mostrar na tela
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
