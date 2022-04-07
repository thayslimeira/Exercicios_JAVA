package Teste;

public class ProdutoElet {
	
	private String nome;
	private int anoFab;
	private String Marca;
	
	
	
	public ProdutoElet(String nome, int anoFab, String marca) {
		super();
		this.nome = nome;
		this.anoFab = anoFab;
		this.Marca = marca;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getAnoFab() {
		return anoFab;
	}



	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}



	public String getMarca() {
		return Marca;
	}



	public void setMarca(String marca) {
		this.Marca = marca;
	}
	
	public void InfoProdutoElet() {
		
		System.out.println("Nome do Produto: "+nome);
		System.out.println("\nAno de Fabricação: "+anoFab);
		System.out.println("\nMarca do Produto: "+Marca);
		
	}
	
	
	
	

}
