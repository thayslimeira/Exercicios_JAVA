package Heran�a;

public class Pregui�a extends Animal {
	
		private String subirArvore;
	
		public Pregui�a (String nome, int idade, String emitirSom, String subirArvore) {
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
			System.out.println("\nAnimal: "+getNome()+"\nIdade: "+getIdade()+"\nEmitir som: "+getEmitirSom()+"\nSubir em �rvores: "+getSubirArvore());
		}

		public void imprimirPregui�a() {
			// TODO Auto-generated method stub
			
		}
		
	
	}