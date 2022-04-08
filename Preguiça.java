package Herança;

public class Preguiça extends Animal {
	
		private String subirArvore;
	
		public Preguiça (String nome, int idade, String emitirSom, String subirArvore) {
		super(nome, idade, emitirSom);
		this.subirArvore = subirArvore;
		
		
	}

		public String getSubirArvore() {
			return subirArvore;
		}

		public void setSubirArvore(String subirArvore) {
			this.subirArvore = subirArvore;
		}
		
		public void impimirCavalo()
		{
			System.out.println("\nAnimal: "+getNome()+"\nIdade: "+getIdade()+"\nEmitir som: "+getEmitirSom()+"\nSubir em Árvores: "+getSubirArvore());
		}

		public void imprimirPreguiça() {
			// TODO Auto-generated method stub
			
		}
		
	
	}