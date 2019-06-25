
public class Principal {

	public static void main(String[] args) {
		Serviços servicos = new Serviços();
		
		Excecao e = new Excecao();
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Rafael Banhos");
		gerente1.setIdade(33);
		gerente1.setSexo("Masculino");
		gerente1.setId("02");
		
		Dancarino d1 = new Dancarino();	
		Dancarina d2 = new Dancarina();
		Dancarina d3 = new Dancarino(); // 3.3 - Polimorfismo por referência

		BoateAuxiliar boate = new BoateAuxiliar();
		boate.setNomeBoate("Fabrica 5");
		boate.setFaixaEtaria("16 anos");
		boate.setEndereco("Avenida Abolição 1220");
		boate.setBairro("Meireles");
		
		
		System.out.println("-----------------------------");
		System.out.println("TRABALHO POO II - 2ª PARCIAL");
		System.out.println("Aluno: Rafael Banhos Sales");
		System.out.println("Matrícula: 17002222");
		System.out.println("Tema: Boate");
		System.out.println("-----------------------------");
		System.out.println();
		System.out.println("Nome da boate: " + boate.getNomeBoate());
		System.out.println("Faixa etária: " + boate.getFaixaEtaria());
		System.out.println("Endereço: " + boate.getEndereco());		
		System.out.println("Bairro: " + boate.getBairro());
		System.out.println();
		
		// 8 - Tratamento Exceção
		try {
		e.checarIdade(16);
		System.out.println();
		
		System.out.println("ID: " + gerente1.getId());
		gerente1.statusBoate(boate, gerente1);
		System.out.println();		

		d1.contratarArtista(2);
		d2.contratarArtista(3, 5);
		
		d1.dancar("Aristobaldo");
		d2.dancar("Chiquinha");		
		
		System.out.println();				
		
		servicos.setNome("Jurandir"); // por ser static, jurandir se torna "global", mesmo que instancie outros objetos.
		System.out.println("Vendedor: " + servicos.getNome());
		servicos.setVendaBebidas(2000);
		servicos.setVendaComidas(3000);
		servicos.setVendaOutros(1000);
		
		servicos.totalVendasServicos(); //total das vendas de todos os serviços
		servicos.faturamentoDia(); // total das vendas do dia menos as despesas		
				
		System.out.println();
		} catch (Exception Ex) {
			System.out.println(Ex.getMessage());
			System.out.println();
		}
		
		System.out.println("[ Fim ]");
	}

}