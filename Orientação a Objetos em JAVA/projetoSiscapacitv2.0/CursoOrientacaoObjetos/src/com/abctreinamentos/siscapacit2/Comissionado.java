package com.abctreinamentos.siscapacit2;

/******************************/
public class Comissionado 
      extends ServidorPublico 
/******************************/      
{
	private double comissao;
	private double salarioFixo;
	
	public Comissionado(double comissao, double salarioFixo,int matricula, String nome) {
		super(matricula,nome);
		this.comissao = comissao;
		this.salarioFixo = salarioFixo;
		super.salario = this.comissao + this.salarioFixo;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	@Override
	public String toString() {
		return "Comissionado [comissao=" + comissao + ", salarioFixo=" + salarioFixo + ", matricula=" + matricula
				+ ", nome=" + nome + "]";
	}
	
	
}
