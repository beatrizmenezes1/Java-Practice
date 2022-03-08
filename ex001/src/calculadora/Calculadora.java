/**
 * 
 */
package calculadora;

import java.util.Scanner;

import model.entidade.Divisao;
import model.entidade.Multiplicacao;
import model.entidade.Soma;
import model.entidade.Subtracao;

/**
 * @author Beatriz Menezes
 *
 */
public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//metodos
		Soma s = new Soma();
		Subtracao sb = new Subtracao();
		Multiplicacao mt = new Multiplicacao();
		Divisao di = new Divisao();

		int op = 0;
		
		do {
			System.out.println("---- CALCULADORA ----");
			System.out.println("1- Soma");
			System.out.println("2- Subtração");
			System.out.println("3- Multiplicação");
			System.out.println("4- Divisão");
			System.out.println("0- Sair");
			op = sc.nextInt();			
			
			switch(op) {
			case 1:
					s.somar();
				break;
			case 2:
					sb.subtrair();
				break;
			case 3:
					mt.multiplicar();
				break;
			case 4:
					di.dividir();
				break;
			case 0:
					System.out.println("Processo Finalizado");
				break;
			default:
					System.out.println("Opção Inválida");
				break;
			}
			
		}while(op != 0);

	}

}
