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
		fornecedor.setRua(null);
		fornecedor.setComp(null);
		fornecedor.setNum(18);
		fornecedor.setBairro(null);
		fornecedor.setCidade(null);
		fornecedor.setEstado(null);
		fornecedor.setCep(null);
		fornecedor.setTelefone1(null);
		fornecedor.setTelefone2(null);
		
		Produto produto = new Produto();
		produto.setCategoria(null);
		produto.setCodBar(0);
		produto.setNomProd(null);
		produto.setPrecoCus(0);
		produto.setPrecoVen(0);
		produto.setQntEst(0);
		produto.setTipoUn(null);
                produto.setDataDeValidade(new ImplementandoDatas().dataAtual());
		
		Usuario usuario = new Usuario();
		usuario.setLogin(null);
		usuario.setNivPerm(0);
		usuario.setSenha("1234");
		
		Venda venda = new Venda();
		venda.setData(new ImplementandoDatas().dataAtual());
		venda.setId(0);
		venda.setNomCliente("Maria");
		venda.setProdutos(null);
		venda.setUsuario(usuario);
		venda.setValor(0);
		
		System.out.println("O CNPJ do fornecedor �:" + fornecedor.getCnpj());
		System.out.println("A data da compra:" + compra.getData());
		System.out.println("O usuario da compra:" + compra.getUsuario());
		System.out.println("A data Entrega da compra:" + compra.getDataEntrega());
		System.out.println("A data Final da compra:" + compra.getDataFinal());
		
		
				
	}
}
