/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 Classe main
 * 
 */
public class Principal {
    public static void main (String[] args) {
		
    	/*String login = JOptionPane.showInputDialog("Informe o login");
    	String senha = JOptionPane.showInputDialog("Informe a senha");
    	
    	if(login.equalsIgnoreCase("admin") &&
    			senha.equalsIgnoreCase("admin")){};*/
    	
    	/*{aqui dentro entra as classes}*/
    	
    	
    	
    	
    	String idCompra = JOptionPane.showInputDialog("Id compra?");
    	String valor = JOptionPane.showInputDialog("Qual o valor?");
    	    	
    		
    	Compra compra = new Compra();
		compra.setId(Integer.valueOf(idCompra)); 
		compra.setValor(Integer.valueOf(valor));
		compra.setData(new ImplementandoData().dataAtual());
		compra.setDataEntrega(new ImplementandoData().dataEntrega());
		
		Venda venda = new Venda();
		venda.setData(new ImplementandoData().dataAtual());
		venda.setId(0);
		venda.setNomCliente("Maria");
		venda.setProdutos(null);
		//venda.setUsuario(usuario);
		venda.setValor(0);
    	
    							
		String idPessoa = JOptionPane.showInputDialog("Qual o ID do cliente/fornecedor?");
		String nome = JOptionPane.showInputDialog("Qual o nome do cliente/fornecedor?");
		String cnpjCpf = JOptionPane.showInputDialog("Qual o CNPJ/CPF?");
		String rua = JOptionPane.showInputDialog("Qual a rua?");
		String comp = JOptionPane.showInputDialog("Qual o complemento?");
		String num = JOptionPane.showInputDialog("Qual o num?");
		String bairro = JOptionPane.showInputDialog("Qual bairro?");
		String cidade = JOptionPane.showInputDialog("Qual cidade?");
		String estado = JOptionPane.showInputDialog("Qual estado?");
		String cep = JOptionPane.showInputDialog("Qual cep?");
		String telef1 = JOptionPane.showInputDialog("Qual telef1?");
		String telef2 = JOptionPane.showInputDialog("Qual telef2?");
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(Integer.valueOf(idPessoa));
		pessoa.setNome(nome);
		pessoa.setCnpjcpf(cnpjCpf);
		pessoa.setRua(rua);
		pessoa.setComp(comp);
		pessoa.setNum(Integer.valueOf(num));
		pessoa.setBairro(bairro);
		pessoa.setCidade(cidade);
		pessoa.setEstado(estado);
		pessoa.setCep(cep);
		pessoa.setTelefone1(telef1);
		pessoa.setTelefone2(telef2);
		
				
		String cupomDesconto = JOptionPane.showInputDialog("Qual ?");
		String ponto = JOptionPane.showInputDialog("Qual ?");
		
		Cliente cliente = new Cliente();
		cliente.setCupomDesconto(Integer.valueOf(cupomDesconto));
		cliente.setPontos(Integer.valueOf(ponto));
				
					 
    	Produto produto = new Produto("cactus", 1, 5, 2, 4, "caixa", "planta"); 
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
		
				
		System.out.println("ID do fornecedor: " + pessoa.getId());
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CNPJ: " + pessoa.getCnpjcpf());
		System.out.println("Rua: " + pessoa.getRua());
		System.out.println("Complemento: " + pessoa.getComp());
		System.out.println("N�mero: " + pessoa.getNum());
		System.out.println("Bairro: " + pessoa.getBairro());
		System.out.println("Cidade: " + pessoa.getCidade());
		
		System.out.println("Categoria: " + produto.getCategoria());
		System.out.println("Nome: " + produto.getNomProd());
		System.out.println("C�digo: " + produto.getCodBar());
		System.out.println("Custo do produto: " + produto.getPrecoCus());
		System.out.println("Pre�o de venda: " + produto.getPrecoVen());
		System.out.println("Quantidade do estoque: " + produto.getQntEst());
					
		System.out.println("Data da compra: " + compra.getData());
		System.out.println("Data Entrega da compra: " + compra.getDataEntrega());
		System.out.println("Data da compra: " + compra.getData());
		System.out.println("Data Entrega da compra: " + compra.getDataEntrega());
		
		
			
				
	}
    }


