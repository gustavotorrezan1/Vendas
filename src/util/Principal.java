/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JOptionPane;

/**
 *
 * @author GustavoTorrezani
 */
public class Principal {
    public static void main (String[] args) {
		
    	String login = JOptionPane.showInputDialog("Informe o login");
    	String senha = JOptionPane.showInputDialog("Informe a senha");
    	
    	if(login.equalsIgnoreCase("admin") &&
    			senha.equalsIgnoreCase("admin")) {
    	
    	Compra compra = new Compra();
		compra.setId(3);
		compra.setUsuario(null);
		compra.setValor(100);
		compra.setProdutos(null);
		compra.setStatus(0);
		compra.setData(new ImplementandoDatas().dataAtual());
		compra.setDataEntrega(new ImplementandoDatas().dataEntrega());
						
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
		produto.setNomProd("cactus");
		produto.setCodBar(1);
		produto.setPrecoVen(5);
		produto.setPrecoCus(2);
		produto.setQntEst(4);
		produto.setTipoUn("caixa");
		produto.setCategoria("planta");
		
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
		System.out.println("Número: " + fornecedor.getNum());
		System.out.println("Bairro: " + fornecedor.getBairro());
		System.out.println("Cidade: " + fornecedor.getCidade());
		
		System.out.println("Categoria: " + produto.getCategoria());
		System.out.println("Nome: " + produto.getNomProd());
		System.out.println("Código: " + produto.getCodBar());
		System.out.println("Custo do produto: " + produto.getPrecoCus());
		System.out.println("Preço de venda: " + produto.getPrecoVen());
		System.out.println("Quantidade do estoque: " + produto.getQntEst());
					
		System.out.println("Data da compra: " + compra.getData());
		System.out.println("Usuario: " + compra.getUsuario());
		System.out.println("Data Entrega da compra: " + compra.getDataEntrega());
		
		
		
				
	}
    }
}
