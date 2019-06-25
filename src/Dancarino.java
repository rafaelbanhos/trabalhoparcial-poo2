
class Dancarino extends Dancarina { // 4.2 Controle de acesso  - Package
	private String nome;
	private int qtdArtista;
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void contratarArtista(int c) { //3.1 Polimorfismo - Override
		this.qtdArtista = c;
		System.out.println(this.qtdArtista + " dançarinos foram contratados.");
	}

	public void dancar(String n) { // 3.2 Polimorfismo -Overriding
		this.nome = n;
		for (int i = 1; i < 2; i++) {
			System.out.println("Dançarino " + n +" rebolando para mulherada " + i + " vez.");	
		}		
	}

}
