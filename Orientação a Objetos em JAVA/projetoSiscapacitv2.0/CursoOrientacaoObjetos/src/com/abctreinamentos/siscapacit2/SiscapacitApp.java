/**************************************/
package com.abctreinamentos.siscapacit2;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

/**************************************/

/********************************************/
public class SiscapacitApp 
    implements APIServidorPublico, APICurso
/********************************************/
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
		sistema.adicionarServidorPublico();
		sistema.adicionarServidorPublico();
		System.out.println("******** 02 Servidores");
		sistema.listarServidoresPublicos();
		
		sistema.adicionarCurso();
		sistema.adicionarCurso();
		System.out.println("******** 02 Cursos");
		sistema.listarCursos();
		
		//sistema.adicionarCursoServidorPublico(1, 10);
		//sistema.adicionarCursoServidorPublico(1, 20);
		
		//sistema.adicionarCursoServidorPublico(2, 10);
		//sistema.adicionarCursoServidorPublico(2, 20);
		
		//sistema.listarCursosServidorPublico(1);
		//sistema.listarCursosServidorPublico(2);
		
		sistema.adicionarServidorCurso(10, 1);
		sistema.adicionarServidorCurso(10, 2);
		
		sistema.adicionarServidorCurso(20, 1);
		sistema.adicionarServidorCurso(20, 2);
		
		sistema.listarServidoresCurso(10);
		sistema.listarServidoresCurso(20);
		
	}
	@Override
	public void adicionarCursoServidorPublico(int matricula, int idcurso) {
		
		boolean encontrou = false;
		
		for(ServidorPublico servidor : servidores)
		{
			if(servidor.getMatricula() == matricula)
			{	
				for (Curso curso : cursos) {
			        if (curso.getIdcurso() == idcurso) {
			            servidor.setCursos(curso);
			            encontrou = true;
			            break;
			        }
			    }
			}
		}
		
		if(!encontrou)
			System.out.println("O Servidor Público com a matrícula informada não existe.");
		else
			System.out.println("O Curso "+idcurso+ " foi incluído no Servidor Público com a matrícula "+matricula);
	}
	@Override
	public void excluirCursoServidorPublico(int matricula, int idcurso) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarCursosServidorPublico(int matricula) {
		for(ServidorPublico servidor : servidores)
		{
			if(servidor.getMatricula() == matricula)
			{	
				System.out.println(servidor);
				System.out.print("Cursos:");
				servidor.getCursos();
			}	
		}
	}
	@Override
	public void adicionarServidorCurso(int idcurso, int matricula) {
		
		boolean encontrou = false;
		
		for(Curso curso : cursos)
		{
			if(curso.getIdcurso() == idcurso)
			{	
				for (ServidorPublico servidor : servidores) {
			        if (servidor.getMatricula() == matricula) {
			            curso.setServidores(servidor);
			            encontrou = true;
			            break;
			        }
			    }
			}
		}
		
		if(!encontrou)
			System.out.println("O Curso com o id informado não existe.");
		else
			System.out.println("O Servidor Público com a matrícula "+matricula+" foi adcionado ao Curso "+idcurso);
		
	}
	@Override
	public void excluirServidorCurso(int idcurso, int matricula) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarServidoresCurso(int idcurso) {
		for(Curso curso : cursos)
		{
			if(curso.getIdcurso() == idcurso)
			{	
				System.out.println(curso);
				System.out.print("Servidores:");
				curso.getServidores();
			}	
		}
	}
}
