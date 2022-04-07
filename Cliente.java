package Teste;

public class Cliente {
	
	//declaração dos atributos de classes
	
	private String nome;
	private int idade;
	private long telefone;
	private long cpf;
	private String endereco;
	
	
	
	
	//declaração do método construtor
	
	public Cliente(String nome, int idade, long telefone, long cpf, String endereco) {
	super();
	this.nome = nome;
	this.idade = idade;
	this.telefone = telefone;
	this.cpf = cpf;
	this.endereco = endereco;
	}

	//declaração dos métodos gerais


	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public long getTelefone() {
		return telefone;
	}




	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}




	public long getCpf() {
		return cpf;
	}




	public void setCpf(long cpf) {
		this.cpf = cpf;
	}




	public String getEndereco() {
		return endereco;
	}




	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
		
		public void info_cliente() {
			
			
			
		
		System.out.println("Nome: "+nome);
		System.out.println("\nIdade: "+idade);
		System.out.println("\nTelefone: "+telefone);
		System.out.println("\nCpf: "+cpf);
		System.out.println("\nEndereço: "+endereco);
		
		
	
	}

	

	
	
	
	

}

