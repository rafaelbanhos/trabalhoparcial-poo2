public abstract class Boate { //6 - Classes Abstratas
	private String nomeBoate; // 1 - Encapsulamento
	private String faixaEtaria; // 1 - Encapsulamento
	private String endereco; // 1 - Encapsulamento
	private String bairro; // 1 - Encapsulamento

	public Boate(){ 
	}    

    public String getNomeBoate() {
        return nomeBoate;
    }

    public void setNomeBoate(String nomeBoate) {
        this.nomeBoate = nomeBoate;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}