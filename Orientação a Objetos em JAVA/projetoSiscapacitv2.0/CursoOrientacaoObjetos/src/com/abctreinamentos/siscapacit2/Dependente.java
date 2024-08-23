package com.abctreinamentos.siscapacit2;

/***********************/
public class Dependente 
/***********************/
{
	private String nome;
	private String cpf;
	private String genero;
	private int idade;
	
	public Dependente(String nome, String cpf, String genero, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
		this.idade = idade;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "[Dependente [nome=" + nome + ", cpf=" + cpf + ", genero=" + genero + ", idade=" + idade + "]]";
	}
	
	
}
