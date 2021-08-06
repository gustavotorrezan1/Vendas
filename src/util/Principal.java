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
		fornecedor.setCnpj("78923695870/0001-99");
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
		produto.setCategoria("cactus suculenta");
		produto.setCodBar(1);
		produto.setNomProd("cacto");
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
		
		System.out.println("O CNPJ do fornecedor:" + fornecedor.getCnpj());
		System.out.println("A data da compra:" + compra.getData());
		System.out.println("O usuario da compra:" + compra.getUsuario());
		System.out.println("A data Entrega da compra:" + compra.getDataEntrega());
		System.out.println("A data Final da compra:" + compra.getDataFinal());
		
		
				
	}
}
