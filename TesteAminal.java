package Heran�a;

public class TesteAminal {

	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Cachorro", 13, "SIM", "SIM" );
		Cavalo cavalo = new Cavalo("Cavalo", 05, "SIM", "SIM");
		Pregui�a preguica = new Pregui�a("Pregui�a", 02, "N�O", "SIM");
		
		
		System.out.print("****************DOGUIN****************");
		cachorro.impimirCachorro();
		System.out.print("\n*****************CAVALIN**************");
		cavalo.impimirCavalo();
		System.out.print("\n***************PREGUICIN**************");
		preguica.imprimirPregui�a();
		
	}
}
