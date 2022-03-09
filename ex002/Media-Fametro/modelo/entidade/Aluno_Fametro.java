package modelo.entidade;

import java.util.Scanner;

public class Aluno_Fametro {
	
	Scanner scan = new Scanner(System.in);
	
	private String nome_aluno;
	private int matricula_aluno;
	

	public String getNome_aluno() {
		return nome_aluno;
	}
	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}
	public int getMatricula_aluno() {
		return matricula_aluno;
	}
	public void setMatricula_aluno(int matricula_aluno) {
		this.matricula_aluno = matricula_aluno;
	}
	
	public void identificador() {
		
		System.out.println("--- Informações do Aluno ---");
		
		System.out.println("Nome do aluno:");
		nome_aluno = scan.nextLine();
		System.out.println("Matrícula: ");
		matricula_aluno = scan.nextInt();
		
		System.out.println("Nome: "+ nome_aluno);
		System.out.println("Matrícul: "+ matricula_aluno);
		
		System.out.println("----------------------------");
	}
	
	
}
