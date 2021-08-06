/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author GustavoTorrezani
 */
public class Principal {
    public static void main (String[] args) {
		Compra compra = new Compra();
		compra.setId(3);
		compra.setUsuario(null);
		compra.setData(null);
		compra.setDataEntrega(new ImplementandoDatas().dataEntrega());
		compra.setDataFinal(new ImplementandoDatas().dataAtual());
		compra.setProdutos(null);
		compra.setStatus(0);
		compra.setValor(100);
				
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setId(0);
		fornecedor.setNome("Joabe");
		fornecedor.setCnpj("78923695870000199");
		fornecedor.setRua("Maceio");
		fornecedor.setComp("casa");
		fornecedor.setNum(18);
		fornecedor.setBairro("Jurere");
		fornecedor.setCidade("Florianopolis");
		fornecedor.setEstado("sc");
		fornecedor.setCep("88210000");
		fornecedor.setTelefone1("4898562356");
		fornecedor.setTelefone2("4898362587");
		
		Produto produto = new Produto();
		produto.setCategoria("planta");
		produto.setCodBar(1);
		produto.setNomProd("cactus");
		produto.setPrecoCus(2);
		produto.setPrecoVen(5);
		produto.setQntEst(4);
		produto.setTipoUn("caixa");
        produto.setDataDeValidade(new ImplementandoDatas().dataAtual());
		
		Usuario usuario = new Usuario();
		usuario.setLogin("Joao");
		usuario.setNivPerm(1);
		usuario.setSenha("1234");
		
		Venda venda = new Venda();
		venda.setData(new ImplementandoDatas().dataAtual());
		venda.setId(0);
		venda.setNomCliente("Maria");
		venda.setProdutos(null);
		venda.setUsuario(usuario);
		venda.setValor(0);
		
		System.out.println("ID do fornecedor: " + fornecedor.getId());
		System.out.println("Nome: " + fornecedor.getNome());
		System.out.println("CNPJ: " + fornecedor.getCnpj());
		System.out.println("Rua: " + fornecedor.getRua());
		System.out.println("Complemento: " + fornecedor.getComp());
		System.out.println("N�mero: " + fornecedor.getNum());
		System.out.println("Bairro: " + fornecedor.getBairro());
		System.out.println("Cidade: " + fornecedor.getCidade());
		
		System.out.println("Categoria: " + produto.getCategoria());
		System.out.println("Nome: " + produto.getNomProd());
		System.out.println("C�digo: " + produto.getCodBar());
		System.out.println("Custo do produto: " + produto.getPrecoCus());
		System.out.println("Pre�o de venda: " + produto.getPrecoVen());
		System.out.println("Quantidade do estoque: " + produto.getQntEst());
		
		
		
		System.out.println("Data da compra: " + compra.getData());
		System.out.println("Usuario: " + compra.getUsuario());
		System.out.println("Data Entrega da compra: " + compra.getDataEntrega());
		System.out.println("Data Final da compra: " + compra.getDataFinal());
		
		
				
	}
}
