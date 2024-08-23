package unidade4;

public class App {

	public static void main(String[] args) {
		
		ServidorPublico servidor = new ServidorPublico(4, "Paulo F. Sampaio", "RFB", "Auditor", "Brasília", "paulo.f.sampaio@rfb.gov.br",30000);
		
		Curso curso = new Curso(1, "Curso de Java", "Presencial", "ABC TREINAMENTOS", 5000);
		servidor.setCursos(curso);
		servidor.getCursos();
		
		Dependente dependente = new Dependente("Bernardo", "123.456", "masculino", 14);
		servidor.setDependentes(dependente);
		servidor.getDependentes();
		
		Telefone telResidencial = new Telefone("Residencial", "559132224553");
		Telefone telComercial = new Telefone("Comercial", "559140090877");
		servidor.setTelefones(telComercial);
		servidor.setTelefones(telResidencial);
		servidor.getTelefones();
		
		Estatutario isabela = new Estatutario(2, 10000,1,"Isabela Sampaio");
		System.out.println(isabela);
		System.out.println(isabela.matricula);
		System.out.println(isabela.getMatricula());
		
		Comissionado leandro = new Comissionado(10000,7000, 2, "Leandro Bastos");
		System.out.println(leandro);
		System.out.println(leandro.salario);
		System.out.println(leandro.getMatricula());
		
		Temporario luisa = new Temporario("2 anos", 3000, 3, "Luisa Teixeira");
		System.out.println(luisa);
		System.out.println(luisa.matricula);
		System.out.println(luisa.getMatricula());
		System.out.println(luisa.calcularSalarioHorasExtras(30)); //Sobrecarga
		System.out.println(luisa.calcularSalarioHorasExtras(30,40)); //Herança

	}

}
