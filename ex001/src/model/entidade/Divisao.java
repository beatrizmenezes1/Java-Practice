package model.entidade;

import java.util.Scanner;

public class Divisao {
	private int num1 = 5;
	private int num2 = 5;
	private int resultado;
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int dividir() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num1 = scan.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = scan.nextInt();
		
		resultado = num1/num2;
		
		System.out.println("RESULTADO: "+ resultado);
		return resultado;
	}
}
