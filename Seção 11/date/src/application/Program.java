package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	/*
	 * Aqui ele importou a parada do ParseException preciso saber o que é
	 */
	public static void main(String[] args) throws ParseException {
		/*
		 * Basicamente aqui ele está setando os padrão ou criando as formatações dos
		 * campos de data que seram utilziados, já utilizando a classe SimpleDateFrom
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		/*
		 * Aqui ta setando o timeZone, igual qualquer outra linguagem
		 */
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//Campo de data normal padrão do JAVA e em Ingles com nome do dia mês dia do mês e horario com milisegundo tipo localidade e ano
		Date x1 = new Date();
		
		//Aqui ele pega a dara com milisegundo tudo com base na data 01/01/1970
		Date x2 = new Date(System.currentTimeMillis());
		
		//Aqui ele pega a 0 hora do dia 01/01/1970 para poder começar os calculos
		Date x3 = new Date(0L);
		
		//Aqui ele está fazendo uma soma de horas para poder apresentar
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		//Aqui ele setou uma data na mão para mostrar que se eu passo uma data ele formata no do jeito que eu quero
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		//Aqui ele usa o instance porque ele consegue fazer com que o horario já saia com a formatação em UTC.
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));

	}

}
