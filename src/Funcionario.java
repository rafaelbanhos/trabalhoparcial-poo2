public abstract class Funcionario { // 6 - Classe Abstrata
	protected String nome; // 4.4 - Controle de acesso: protected
	protected int idade;
	protected String sexo;

	public Funcionario() {
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}