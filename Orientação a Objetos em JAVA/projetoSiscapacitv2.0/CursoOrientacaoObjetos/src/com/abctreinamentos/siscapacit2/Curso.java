/**************************************/
package com.abctreinamentos.siscapacit2;
/**************************************/

import java.util.LinkedList;
import java.util.List;

/******************/
public class Curso 
/******************/
{
    //Atributos
	private int idcurso;
    private String nome;
    private String formarealizacao;
    private String ofertante;
    private double valor;
    
    //Reuso - Associação
    private List<ServidorPublico> servidores = new LinkedList<ServidorPublico>();
    
    // Construtor
    public Curso() {
		// TODO Auto-generated constructor stub
	}
    
    public Curso(int idcurso, String nome, String formarealizacao, String ofertante, double valor) {
        this.idcurso = idcurso;
        this.nome = nome;
        this.formarealizacao = formarealizacao;
        this.ofertante = ofertante;
        this.valor = valor;
    }

    // Getters e Setters
    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormarealizacao() {
        return formarealizacao;
    }

    public void setFormarealizacao(String formarealizacao) {
        this.formarealizacao = formarealizacao;
    }

    public String getOfertante() {
        return ofertante;
    }

    public void setOfertante(String ofertante) {
        this.ofertante = ofertante;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

	public void getServidores() {
		System.out.println(servidores);
	}

	public void setServidores(ServidorPublico servidor) {
		servidores.add(servidor);
	}

	@Override
	public String toString() {
		return "Curso [idcurso=" + idcurso + ", nome=" + nome + ", formarealizacao=" + formarealizacao + ", ofertante="
				+ ofertante + ", valor=" + valor + "]";
	}
}

