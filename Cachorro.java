package Herança;

public class Cachorro extends Animal {
	
	private String correr;
	
	
	public Cachorro (String nome, int idade, String correr, String emitirSom) {
		
		super(nome,idade,emitirSom);
		this.correr = correr;
		
		
	}


	public String getCorrer() {
		return correr;
	}


	public void setCorrer(String correr) {
		this.correr = correr;
	
	}

	public void impimirCachorro()
	{
		System.out.println("\nAnimal: "+getNome()+"\nIdade: "+getIdade()+"\nEmitir som: "+getEmitirSom()+"\nCorrer: "+getCorrer());
	}
	
}
