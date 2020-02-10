package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		//Somando uma unidade de tempo
		//Passou o formato da data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Setou como UTC e fez o parce da data passado como parâmetro
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		//Aqui começa o calendar
		Calendar cal = Calendar.getInstance();
		//Ele diz que vai setar a mascara como default ou timezone
		cal.setTime(d);
		
		//Aqui soma 4 horas na data que ele recebeu
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		//Aqui atribui a variavel o valor de data que foi formatada
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		
		
		//Obtendo uma unidade de tempo
		
		//Aqui a mesma coisa só que com minutos e meses
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
//		System.out.println(sdf.format(d));
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(d);
//		int minutes = cal.get(Calendar.MINUTE);
//		int month = 1 + cal.get(Calendar.MONTH);
//		System.out.println("Minutes: " + minutes);
//		System.out.println("Month: " + month);

	}

}
