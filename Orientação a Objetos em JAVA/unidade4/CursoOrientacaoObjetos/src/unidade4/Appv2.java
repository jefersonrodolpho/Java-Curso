package unidade4;

public class Appv2 implements APIServidorPublico{

	public static void verificarTipoServidorPublico(ServidorPublico servidor)
	{
		if (servidor instanceof Estatutario)
			System.out.println("Estatutario");
		else if (servidor instanceof Comissionado)
			System.out.println("Comissionado");
		else if(servidor instanceof Temporario)
			System.out.println("Temporário");
		else
			System.out.println("Não foi especializado. Permanece Servidor Público");
	}
	
	
	public static void main(String[] args) {
	
		ServidorPublico isabela = new Comissionado(5000, 3000, 1, "Isabela Sampaio");
		
		verificarTipoServidorPublico(isabela);
		
		isabela = new Estatutario(0, 15000, 1, "Isabela Sampaio");
		
		verificarTipoServidorPublico(isabela);
		
		System.out.println(isabela);
		System.out.println(((Estatutario)isabela).getTempoServico());
		System.out.println(((Estatutario)isabela).getSalarioBase());
		
		ServidorPublico pedro = new Temporario("1", 3000, 2, "Pedro Oliveira");
		System.out.println(pedro.calcularSalarioHorasExtras(40));
		System.out.println(pedro);
		
		isabela.exibirInformacoes();

	}

	@Override //Anulação
	public void adicionarServidorPublico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarServidoresPublicos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarServidorPublico(int matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarServidorPublico(com.abctreinamentos.siscapacit.ServidorPublico servidorAlterado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirServidorPublico(int matricula) {
		// TODO Auto-generated method stub
		
	}
}
