import java.util.Scanner;

public class exercicio_if_else_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Mais um exemplo que eu tive que pegar dele, porque não saberia fazer 
		//ou teria dado muita volta para consegir chegar nesse resultado
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			
		sc.close();
		
		/* mais aqui eu pelo menos consegui intender o que ele fez,
		 * se o jogo começou mais cedo eu vou pegar o valor final e fazer menos o valor inicial.
		 * 
		 * 
		 * mais quando o jogo terminou passando das 0:00 ele assume que o dia tem 24 horas, 
		 * faz 24 menos a hora inicail do jogo, e ai soma com a hora final que provavelmente já passou das 0:00
		 *  e soma no valor final do game assim fica certa a soma, eu nunca teria penasado nisso. 
		 * */
		
	}

}
