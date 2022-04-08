package Heran�a;

public class Cachorrinho extends Animais {

	private String Raca;
	private String Genero;
	
	
public Cachorrinho(String Nome, int Idade, String Som, String Correr, String Raca, String Genero) {
		
		super(Nome,Idade,Som,Correr);
		this.Raca = Raca;
		this.Genero = Genero;
	

	}
public String getRaca() {
	return Raca;
}



public void setRaca(String raca) {
	Raca = raca;
}



public String getGenero() {
	return Genero;
}



public void setGenero(String genero) {
	Genero = genero;
}
	







@Override
public void Info(String info) {
	System.out.println("Nome: "+ getNome()+ "\nIdade: "+getIdade()+"\nSom produzido: "+getSom()+"\nCorre: "+getCorrer()
	+"\nRa�a: "+ Raca + "\nGenero: "+ Genero);
	
}

}
