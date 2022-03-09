/**
 * 
 */
package media_fametro;

import java.util.Scanner;
import modelo.entidade.Aluno_Fametro;
import modelo.entidade.CalculoMedia;

/**
 * @author Beatriz Menezes
 *
 */
public class Media_Fametro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno_Fametro af = new Aluno_Fametro();
		CalculoMedia cm = new CalculoMedia();
		
		int op;
		
		System.out.println("Sistema de Médias de Notas Fametro\n");
		
		do {
			System.out.println("");
			System.out.println("1- Média");
			System.out.println("2- Sair");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
					af.identificador();
					cm.calcularMedia();
				break;
			case 2:
					System.out.println("processo Finalizado");
				break;
			default:
					System.out.println("Opção Inválida");
				break;
			}
			
		}while(op != 2);
		
		
	}

}
