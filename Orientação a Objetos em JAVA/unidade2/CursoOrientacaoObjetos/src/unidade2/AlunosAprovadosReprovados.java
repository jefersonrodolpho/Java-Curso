package unidade2;

import java.util.Scanner;

public class AlunosAprovadosReprovados {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o Número de Alunos");
		int numeroAlunos = scanner.nextInt();
		
		double nota1,nota2;
		double media = 0;
		double mediaTurma = 0;
		int numeroAlunosAprovados = 0, numeroAlunosReprovados = 0;
		
		for(int i =0; i < numeroAlunos; i++)
		{
			System.out.println("Digite a Primeira Nota do Aluno:"+(i+1));
			nota1 = scanner.nextDouble();
			
			System.out.println("Digite a Segunda Nota do Aluno:"+(i+1));
			nota2 = scanner.nextDouble();
			
			media = (nota1+nota2)/2;
			
			if(media >= 6)
				numeroAlunosAprovados++;
			else
				numeroAlunosReprovados++;
			
			mediaTurma = mediaTurma + media;
		}
		mediaTurma = mediaTurma/numeroAlunos;
		
		System.out.println("O Número de Alunos Aprovados ="+numeroAlunosAprovados);
		System.out.println("O Número de Alunos Reprovados ="+numeroAlunosReprovados);
		System.out.println("A média Aritmética da Turma ="+mediaTurma);
		scanner.close();
	}
}
