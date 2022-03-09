package modelo.entidade;

import java.util.Scanner;

public class CalculoMedia {
	
	Scanner scanf = new Scanner(System.in);
	
	private float parcial_1, prova_1, n1; //n1
	private float parcial_2, prova_2, n2; //n2
	private float nota_final; //media final para a condição
	private float n3, nota_final2; //media final recuperação
	
	/*
	public float getParcial_1() {
		return parcial_1;
	}
	public void setParcial_1(float parcial_1) {
		this.parcial_1 = parcial_1;
	}
	public float getProva_1() {
		return prova_1;
	}
	public void setProva_1(float prova_1) {
		this.prova_1 = prova_1;
	}
	public float getN1() {
		return n1;
	}
	public void setN1(float n1) {
		this.n1 = n1;
	}
	public float getParcial_2() {
		return parcial_2;
	}
	public void setParcial_2(float parcial_2) {
		this.parcial_2 = parcial_2;
	}
	public float getProva_2() {
		return prova_2;
	}
	public void setProva_2(float prova_2) {
		this.prova_2 = prova_2;
	}
	public float getN2() {
		return n2;
	}
	public void setN2(float n2) {
		this.n2 = n2;
	}
	public float getNota_final() {
		return nota_final;
	}
	public void setNota_final(float nota_final) {
		this.nota_final = nota_final;
	}
	public float getN3() {
		return n3;
	}
	public void setN3(float n3) {
		this.n3 = n3;
	}
	public float getNota_final2() {
		return nota_final2;
	}
	public void setNota_final2(float nota_final2) {
		this.nota_final2 = nota_final2;
	}
	
	*/
	public void calcularMedia() {
		
		System.out.println("--- MÉDIA ALUNO ---\n");
		System.out.println("Média N1\n");
		
		System.out.println("Digite a nota da Parical 1: ");
		parcial_1 = scanf.nextFloat();
		System.out.println("Digite a nota da Prova Institucional 1: ");
		prova_1 = scanf.nextFloat();
		
		n1 = (parcial_1 + prova_1)/2;
		
		System.out.println("Nota N1: "+ n1);
		
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println("Média N2\n");
		
		System.out.println("Digite a nota da Parcial 2: ");
		parcial_2 = scanf.nextFloat();
		System.out.println("Digite a nota da Prova Institucional 2: ");
		prova_2 = scanf.nextFloat();
		
		n2 = (parcial_2 + prova_2)/2;
		
		System.out.println("Nota N2: "+ n2);
		
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println("Média Final\n");
		
		nota_final = (n1+n2)/2;
		
		System.out.println("Média Final: \n"+ nota_final);
		
		if(nota_final <= 4.0) {
			System.out.println("Aluno Reprovado :( ");
		} else if((nota_final > 4.1) && (nota_final < 5.0)) {
			
			System.out.println("");
			System.out.println("------------------------------------");
			System.out.println("Aluno na N3 :| ");
			System.out.println("Digite a nota da N3: ");
			n3 = scanf.nextFloat();
			
			nota_final2 = (nota_final + n3)/2;
				
				if(nota_final2 < 5.0) {
					System.out.println("Reprovado! Sua nota: "+ nota_final2);
				}else {
					System.out.println("Aprovado!!! Sua nota: "+ nota_final2);
				}
			
		}else {
			System.out.println("Aluno Aprovado :) ");
		}
		System.out.println("--------------------------------------");
	}

}
