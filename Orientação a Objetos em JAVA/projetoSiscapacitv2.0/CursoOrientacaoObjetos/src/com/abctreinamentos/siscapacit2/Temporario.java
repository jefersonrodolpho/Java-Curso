package com.abctreinamentos.siscapacit2;

/******************************/
public class Temporario 
      extends ServidorPublico 
/******************************/
{
	private static final int VALOR_HORA_EXTRA = 30;
	private String contrato;
	private double salario;
	
	public Temporario(String contrato, double salario,int matricula, String nome) {
		super(matricula,nome);
		this.contrato = contrato;
		this.salario = salario;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Temporario [contrato=" + contrato + ", salario=" + salario + ", matricula=" + matricula + ", nome="
				+ nome + "]";
	}
	
	public final double calcularSalarioHorasExtras(int horasTrabalhadas)
	{
		double salarioMensal = 0;
		
		salarioMensal = salarioMensal + horasTrabalhadas*VALOR_HORA_EXTRA;
				
		return (this.salario+salarioMensal);
	}
	
}
