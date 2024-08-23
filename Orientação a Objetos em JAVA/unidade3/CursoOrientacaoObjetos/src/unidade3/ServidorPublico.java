package unidade3;

/***************************/
public class ServidorPublico 
/***************************/
{
	/***** Construtores ****
	 * 
	 */
	
	public ServidorPublico()
	{
		
	}
	
	public ServidorPublico(int matricula, String nome, String cargo) {
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
	}

	public ServidorPublico(int matricula, String nome, String foto, String orgao, String vinculo, double salario,
			int idade, int tempoContribuicao, String cargo, String lotacao, String exercicio, String email,
			String telefone, String celular, String cpf, String naturalidade) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.foto = foto;
		this.orgao = orgao;
		this.vinculo = vinculo;
		this.salario = salario;
		this.idade = idade;
		this.tempoContribuicao = tempoContribuicao;
		this.cargo = cargo;
		this.lotacao = lotacao;
		this.exercicio = exercicio;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.cpf = cpf;
		this.naturalidade = naturalidade;
	}

	/******* Atributos ***********/
	private final int VALOR_HORA_EXTRA = 40;
	private static int totalServidores; // Atributo de Classe
	private Avaliacao avalicao; //Tipo Enum
	public Avaliacao getAvalicao() {
		return avalicao;
	}

	public void setAvalicao(Avaliacao avalicao) {
		this.avalicao = avalicao;
	}

	private int matricula; 
	private String nome; 
	private String foto;
	private String orgao; 
	private String vinculo; 
	private double salario;
	private int idade; 
	private int tempoContribuicao; 
	private String cargo;
	private String lotacao; 
	private String exercicio; 
	private String email;
	private String telefone; 
	private String celular; 
	private String cpf;
	private String naturalidade;
	
	/****** Métodos Get/Set ************/
	
	public static int getTotalServidores() { //Método de Classe
		return totalServidores;
	}
		
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getOrgao() {
		return orgao;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public String getVinculo() {
		return vinculo;
	}

	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTempoContribuicao() {
		return tempoContribuicao;
	}

	public void setTempoContribuicao(int tempoContribuicao) {
		this.tempoContribuicao = tempoContribuicao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getLotacao() {
		return lotacao;
	}

	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}

	public String getExercicio() {
		return exercicio;
	}

	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	
	public final double calcularSalarioHorasExtras(int... horasTrabalhadas)
	{
		double salarioMensal = 0;
		
		for(int horasExtras : horasTrabalhadas)
			salarioMensal = salarioMensal + horasExtras*VALOR_HORA_EXTRA;
				
		return (salario+salarioMensal);
	}
	
	public void mostrarTamanhoNome()
	{
		System.out.println(this.nome.length());
	}
	
	public void mostrarPreNome()
	{
		System.out.println(this.nome.substring(0, nome.indexOf(" ")));
	}
	
	public void mostrarSobreNome()
	{
		System.out.println(this.nome.substring(nome.indexOf(" ")+1));
	}
	

	public static void main(String[] args) {
		
		ServidorPublico isabela = new ServidorPublico(1,"Isabela Sampaio","Auditor"); //criado o 1 objeto
		totalServidores++;
		isabela.setSalario(15000);
		System.out.println(isabela.calcularSalarioHorasExtras(8,10,0,15));
		
		ServidorPublico heila = new ServidorPublico(2,"Heila Ghassan","Estagiário"); //criado o 2 objeto	
		heila.setMatricula(2);
		totalServidores++;
		ServidorPublico maria = new ServidorPublico(3,"Maria Fontenele","Analista"); //criado o 3 objeto
		totalServidores++;
		ServidorPublico caio = new ServidorPublico(4,"Caio Santos","Analista Tributário"); //criado o 4 objeto
		totalServidores++;
		ServidorPublico leandro = new ServidorPublico();
		totalServidores++;
		System.out.println(getTotalServidores());
		
		caio.mostrarTamanhoNome();
		caio.mostrarPreNome();
		caio.mostrarSobreNome();
		caio.setAvalicao(Avaliacao.BOM);
		isabela.setAvalicao(Avaliacao.EXCELENTE);
		heila.setAvalicao(Avaliacao.BOM);
		
	}
}
