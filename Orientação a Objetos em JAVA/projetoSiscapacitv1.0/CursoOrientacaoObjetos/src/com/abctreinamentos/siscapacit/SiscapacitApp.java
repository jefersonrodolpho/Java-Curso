/**************************************/
package com.abctreinamentos.siscapacit;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

/**************************************/

/*************************/
public class SiscapacitApp 
/*************************/
{
	//Atributos
	List<ServidorPublico> servidores = new LinkedList<>();
	List<Curso> cursos = new LinkedList<>();
	
	//Métodos CRUD - ServidorPublico
	//Adiconar Servidor Público
	public void adicionarServidorPublico()
	{
		int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula"));
	    String nome = JOptionPane.showInputDialog("Digite o nome");
	    String orgao = JOptionPane.showInputDialog("Digite o órgão");
	    String cargo = JOptionPane.showInputDialog("Digite o cargo");
	    String lotacao = JOptionPane.showInputDialog("Digite a lotação");
	    String email = JOptionPane.showInputDialog("Digite o email");
	    double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
		
		ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, cargo, lotacao, email, salario);
		servidores.add(servidor);
	}
	//Listar Servidores Públicos
	public void listarServidoresPublicos()
	{
		for(ServidorPublico servidor : servidores)
			System.out.println(servidor);
	}
	//Listar 01 Servidor Público
	public void listarServidorPublico(int matricula)
	{
		boolean encontrou = false;
		
		for(ServidorPublico servidor : servidores)
		{
			if(servidor.getMatricula() == matricula)
			{	
				System.out.println(servidor);
				encontrou = true;
				break;
			}
		}
		
		if(!encontrou)
			System.out.println("O Servidor Público com a matrícula informada não existe.");
			
	}
	//Alterar Servidor Público
	public void alterarServidorPublico(ServidorPublico servidorAlterado)
	{
		boolean encontrou = false;
		
		for(ServidorPublico servidor : servidores)
		{
			if(servidor.getMatricula() == servidorAlterado.getMatricula())
			{	
				servidores.remove(servidor);
				servidores.add(servidorAlterado);
				encontrou = true;
				break;
			}
		}
		
		if(!encontrou)
			System.out.println("O Servidor Público com a matrícula informada não existe.");
		else
			System.out.println("A alteração do Servidor Público com a matrícula "+servidorAlterado.getMatricula()+
					" foi realizada com sucesso!");
	}
	//Excluir Servidor Público
	public void excluirServidorPublico(int matricula)
	{
		boolean encontrou = false;
		
		for(ServidorPublico servidor : servidores)
		{
			if(servidor.getMatricula() == matricula)
			{	
				servidores.remove(servidor);
				encontrou = true;
				break;
			}
		}
		
		if(!encontrou)
			System.out.println("O Servidor Público com a matrícula informada não existe.");
		else
			System.out.println("A exclusão do Servidor Público com a matrícula "+matricula+
					" foi realizada com sucesso!");
	}
	
	//Método - ServidorPublico
	
	public void calcularFolhaServidoresPublicos()
	{
		double folhaSalarial = 0;
		for(ServidorPublico servidor : servidores)
			folhaSalarial = folhaSalarial + servidor.getSalario();
		System.out.println("A folha salarial é "+folhaSalarial);
	}
	

	//Métodos CRUD - Curso
	//Adicionar Curso
	public void adicionarCurso() {
	    int idcurso = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do curso"));
	    String nome = JOptionPane.showInputDialog("Digite o nome do curso");
	    String formarealizacao = JOptionPane.showInputDialog("Digite a forma de realização do curso");
	    String ofertante = JOptionPane.showInputDialog("Digite o ofertante do curso");
	    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do curso"));

	    Curso curso = new Curso(idcurso, nome, formarealizacao, ofertante, valor);
	    cursos.add(curso); // Adicionar o curso a uma lista de cursos, se desejado
	}
	//Listar Cursos
	public void listarCursos() {
	    for(Curso curso : cursos) {
	        System.out.println(curso);
	    }
	}
	//Listar 01 Curso
	public void listarCurso(int idcurso) {
	    boolean encontrou = false;
	    
	    for (Curso curso : cursos) {
	        if (curso.getIdcurso() == idcurso) {
	            System.out.println(curso);
	            encontrou = true;
	            break;
	        }
	    }

	    if (!encontrou) {
	        System.out.println("O curso com o ID informado não foi encontrado.");
	    }
	}
	//Alterar Curso
	public void alterarCurso(Curso cursoAlterado) {
	    boolean encontrou = false;

	    for (Curso curso : cursos) {
	        if (curso.getIdcurso() == cursoAlterado.getIdcurso()) {
	            cursos.remove(curso);
	            cursos.add(cursoAlterado);
	            encontrou = true;
	            break;
	        }
	    }

	    if (!encontrou) {
	        System.out.println("O curso com o ID informado não foi encontrado.");
	    } else {
	        System.out.println("A alteração do curso com o ID " + cursoAlterado.getIdcurso() +
	                " foi realizada com sucesso!");
	    }
	}
	//Excluir Curso
	public void excluirCurso(int idcurso) {
	    boolean encontrou = false;

	    for (Curso curso : cursos) {
	        if (curso.getIdcurso() == idcurso) {
	            cursos.remove(curso);
	            encontrou = true;
	            break;
	        }
	    }

	    if (!encontrou) {
	        System.out.println("O curso com o ID informado não foi encontrado.");
	    } else {
	        System.out.println("A exclusão do curso com o ID " + idcurso +
	                " foi realizada com sucesso!");
	    }
	}

	public static void main(String[] args) {
		SiscapacitApp sistema = new SiscapacitApp();
		/*
		sistema.adicionarServidorPublico();
		sistema.adicionarServidorPublico();
		System.out.println("******** 02 Servidores");
		sistema.listarServidoresPublicos();
		//sistema.listarServidorPublico(1);
		//sistema.listarServidorPublico(4);
		//sistema.excluirServidorPublico(4);
		ServidorPublico servidorAletrado = new ServidorPublico(4, "Paulo F. Sampaio", "RFB", "Auditor", "Brasília", "paulo.f.sampaio@rfb.gov.br",30000);
		sistema.alterarServidorPublico(servidorAletrado);
		System.out.println("******** 02 Servidores");
		sistema.listarServidoresPublicos();
		sistema.calcularFolhaServidoresPublicos(); */
		
		sistema.adicionarCurso();
		sistema.adicionarCurso();
		System.out.println("******** 02 Cursos");
		sistema.listarCursos();
		sistema.listarCurso(1);
		sistema.listarCurso(2);
		sistema.excluirCurso(1);

		Curso cursoAlterado = new Curso(2, "Curso Alterado", "Presencial", "Instituição X", 250.0);
		sistema.alterarCurso(cursoAlterado);

		System.out.println("******** 01 Curso");
		sistema.listarCursos();

		
		
	}
}
