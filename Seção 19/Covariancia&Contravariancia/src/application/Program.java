package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	/*
	 * Aqui ele mostra como funciona o principio get/put ou covariancia e
	 * contravariancia
	 * 
	 * 
	 * todas as vezes que você permite instancias uma lista e todos os seus filhos é
	 * chamado de covariancia e só é permitido acessar os dados da lista mais é
	 * impossivel inserir dados na lista
	 * 
	 * 
	 * já quando a lista é de um tipo generico ou de um super tipo generico da lista
	 * é chamado de contravariancia e nesse caso não é possivel acessar os dados da
	 * lista mais é possivel inserir dados novos na lista
	 */
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}

	/*
	 * esse método é a prova disso, no primieiro parâmetro eu uso a covariancia para
	 * poder pegar os dados dentro da lista, e no segundo parâmetro eu uso a
	 * contravariancia para poder inserir dados na lista.
	 */
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}