public final class Gerente extends Funcionario { // 2 -Herança
	private String id; // 1- Encapsulamento
	
	public Gerente() {
	}

	public void statusBoate(BoateAuxiliar boate, Gerente gerente) { // 4.1 - Controle de acesso: Public
		System.out.println("Gerente: " + gerente.getNome());
		System.out.println("Boate: " + boate.getNomeBoate());
		
		System.out.println("Em funcionamento!");
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}
}