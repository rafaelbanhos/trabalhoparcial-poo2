public class Serviços implements Financeiro { // 7 - Interface(implementação)
	private static String nome = "Balconista"; // 5 - Controle Static
	private double vendaBebidas; // 4.3 - Controle de Acesso: Private
	private double vendaComidas; 
	private double vendaOutros; 
	private double vendasServicosTotal;
	private final double despesas = 200; // 5 - Controle Final
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDespesas() {
		return despesas;
	}

	public double getVendaBebidas() {
		return vendaBebidas;
	}

	public void setVendaBebidas(double vendaBebidas) {
		this.vendaBebidas = vendaBebidas;
	}

	public double getVendaComidas() {
		return vendaComidas;
	}

	public void setVendaComidas(double vendaComidas) {
		this.vendaComidas = vendaComidas;
	}

	public double getVendaOutros() {
		return vendaOutros;
	}

	public void setVendaOutros(double vendaOutros) {
		this.vendaOutros = vendaOutros;
	}

	public double getValorServicoTotal() {
		return vendasServicosTotal;
	}

	public void setValorServicoTotal(double valorServicoTotal) {
		this.vendasServicosTotal = valorServicoTotal;
	}


	public void totalVendasServicos() {
		this.vendasServicosTotal = (this.vendaBebidas + this.vendaComidas + this.vendaOutros);
		System.out.println("Total de vendas: " + getValorServicoTotal());
	}

	public void faturamentoDia() {		
			System.out.println("Lucro em dinheiro do dia: R$ " + (getValorServicoTotal() - this.despesas) + " reais");		
	}
}