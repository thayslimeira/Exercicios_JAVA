package Teste;

public class Aviao {

	//declara��o dos atributos de classes
	
	private String Modelo;
	private int QuantMotores;
	private String Tipo;
	private int Flaps;
	
	
	//declara��o do m�todo construtor
	
		public Aviao(String modelo, int quantMotores, String tipo, int flaps) {
		super();
		this.Modelo = modelo;
		this.QuantMotores = quantMotores;
		this.Tipo = tipo;
		this.Flaps = flaps;
	}
		//declara��o dos m�todos gerais


		public String getModelo() {
			return Modelo;
		}


		public void setModelo(String modelo) {
			this.Modelo = modelo;
		}


		public int getQuantMotores() {
			return QuantMotores;
		}


		public void setQuantMotores(int quantMotores) {
			this.QuantMotores = quantMotores;
		}


		public String getTipo() {
			return Tipo;
		}


		public void setTipo(String tipo) {
			this.Tipo = tipo;
		}


		public int getFlaps() {
			return Flaps;
		}
		
	
		
	
		public void setFlaps(int flaps) {
			this.Flaps = flaps;
		}
		
		public void info_Aviao() {
			
			
			System.out.println("Modelo: "+Modelo);
			System.out.println("\nQuantidade de Motores: "+QuantMotores);
			System.out.println("\nTipo de Avi�o: "+Tipo);
			System.out.println("\nQuantidade de Flaps: "+Flaps);
			
		}
		
	
	
}
