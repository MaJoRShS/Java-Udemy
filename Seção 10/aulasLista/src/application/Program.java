package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		/*
		 * Aqui como eu preciso de uma classe que tenha a interface List implementada e
		 * preciso de um metodo que eu consiga usar tanto como lista quanto como array
		 * eu uso o ArrayList, e eu poderia passar um tipo para o ArrayList mais assim
		 * fica mais limpo e funciona igual
		 * 
		 * S� lembrando que o meu List tem que ter entre o <> o tipo da minha lista.
		 */
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// Esse cara � uma sobrecarga do .add(), aqui eu passo a posi��o em que eu quero
		// colocar esse cara.
		list.add(2, "Marco");

		// Ver o tamanho da lista
		System.out.println(list.size());

		// Aqui o remove tanto remove por valor, ent�o ele vai procurar qual item da
		// lista tem aquele valor e tamb�m por posi��o.
		// list.remove("Anna");
		// list.remove(1);

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------------------------");
		// Aqui � o que ele chama de predicado, � um lambida que cria uma variavel x do
		// tipo String e que procura dentro dela todos que come�am com 'M' para serem
		// removidas.
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------");
		//Aqui ele procura a posi��o na lista daquele elemento, e retorna essa posi��o, ou seja voc� precisa saber o conteudo daquela posi��o.
		//Se for o primeiro item da lista retorna 0 mesmo.
		System.out.println("Index Of Bob: " + list.indexOf("Bob"));

		//Aqui ele n�o existe o cara na lista ai ele devolve -1, isso significa que n�o achou o restro do cara.
		System.out.println("Index Of Bob: " + list.indexOf("Marco"));
		
		
		
		
		System.out.println("---------------------------------------");
		//Aqui eu tenho uma lista, converto para stream, e depois fa�o o lambida e depois devolvo para lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		
		//Aqui eu to pegando o elemento com base do predicado e s� vai me retornar se encontrar o elemento, caso contrario ele devolve nulo.
		System.out.println("---------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
