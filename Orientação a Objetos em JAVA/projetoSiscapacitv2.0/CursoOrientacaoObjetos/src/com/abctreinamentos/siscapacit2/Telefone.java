package com.abctreinamentos.siscapacit2;

/*********************/
public class Telefone 
/*********************/
{
	String tipoTelefone;
	String numero;
	
	public Telefone(String tipoTelefone, String numero) {
		super();
		this.tipoTelefone = tipoTelefone;
		this.numero = numero;
	}

	//Getters e Setters
	public String getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "[Telefone [tipoTelefone=" + tipoTelefone + ", numero=" + numero + "]]";
	}
	
	
	
	
}
