
class Dancarina { //4.2 Controle de Acesso - Package
	private String nome;
	private int qtdArtista;
	private int qtdStriper;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void contratarArtista(int artista, int striper) { //3.1 Polimorfismo - Override
		this.qtdArtista = artista;
		this.qtdStriper = striper;
		System.out.println(this.qtdArtista + " dançarinas foram contratadas e " + this.qtdStriper + " stripers foram contratadas.");
	}

	public void dancar(String n) { // 3.2 Polimorfismo -Overriding
		this.nome = n;
		System.out.println("Dançarina " + n + " na pista.");		
	}
}
