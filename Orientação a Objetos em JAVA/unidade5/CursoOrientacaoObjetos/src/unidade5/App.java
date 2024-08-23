package unidade5;

public class App {

	public static void main(String[] args) {
		Curso curso = new Curso(1, "Curso de Java", "Presencial", "ABC TREINAMENTOS", 5000);
		System.out.println(curso);
		System.out.println(curso.nome());
		System.out.println(curso.valor());
	}

}
