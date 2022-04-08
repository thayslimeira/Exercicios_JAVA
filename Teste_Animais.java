package Herança;

public class Teste_Animais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorrinho cachorro = new Cachorrinho("Kira",2,"latido","Muito","Akita","Femea");
		Cavalinho cavalo = new Cavalinho("Chuchu",1,"Som de cavalo padrao","Mais ainda","1 milha","Femea","Marrom");
		Preguicinha preguiça = new Preguicinha("Táta",6,"??","Nãozinho","Femea","Cinza");
		
		Animais Animal = null;
		
		int n = (int) (Math.random()*3.0);
		
		switch(n) {
		
		
		case 0: Animal = cachorro;break;
		
		case 1: Animal = cavalo;break;
		
		case 2: Animal = preguiça;break;

		default: System.out.println("Erro inesperado");break;
						
		}
		
		if(Animal != null) {
			
			Animal.Info(null);
						
		}
	
	}

}
