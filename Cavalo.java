package Herança;

public class Cavalo extends Animal {
	private String correr;
	
	
		public Cavalo (String nome, int idade, String correr, String emitirSom) {
		
		super(nome,idade,emitirSom);
		this.correr = correr;
 }


		public String getCorrer() {
			return correr;
		}


		public void setCorrer(String correr) {
			this.correr = correr;
		}

		
		public void impimirCavalo()
		{
			System.out.println("\nAnimal: "+getNome()+"\nIdade: "+getIdade()+"\nEmitir som: "+getEmitirSom()+"\nCorrer: "+getCorrer());
		}
		
		
}

		
