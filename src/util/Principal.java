/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

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
    			senha.equalsIgnoreCase("admin"))
    	{aqui dentro entra as classes}*/
    	
    	/*String idCompra = JOptionPane.showInputDialog("Id compra?");
    	/*String usuarioC = JOptionPane.showInputDialog("Nome vendedor?");PUXAR USUARIO
    	/*String valor = JOptionPane.showInputDialog("Qual o valor?");
    	/*String produtoC = JOptionPane.showInputDialog("Qual o produto?");PUXAR PRODUTO
    	/*String status = JOptionPane.showInputDialog("Qual o status?");VERIFICAR NECESSIDADE
    	
    		
    	Compra compra = new Compra();
		compra.setId(Integer.valueOf(idCompra)); 
		/*compra.setUsuario(Integer.valueOf(usuarioC));*//*verificar usuario*/
		/*compra.setValor(Integer.valueOf(valor));
		/*compra.setProdutos(produtoC);*//*verificar produto*/
		/*compra.setStatus (Integer.valueOf(status));
		compra.setData(new ImplementandoData().dataAtual());
		compra.setDataEntrega(new ImplementandoData().dataEntrega());*/
		
		
						
		/*String idPessoa = JOptionPane.showInputDialog("Qual o ID da pessoa?");
		String nome = JOptionPane.showInputDialog("Qual o nome da pessoa?");
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
		pessoa.setTelefone2(telef2);*/
				
		
		/*Produto produto1 = new Produto("casctus", 1, 5, 2, 4, "unidade", "planta");
		/*Produto produto2 = new Produto("vaso", 2, 5, 2, 4, "unidade","utensilio");
	 	/*Produto produto3 = new Produto("grama", 3, 5, 2, 4, "metro", "planta");
		/*Produto produto4 = new Produto("bacia", 4, 5, 2, 4, "unidade", "planta"); 
		/*Produto produto5 = new Produto("rosa", 5, 5, 2, 4, "unidade", "planta");
		/*Produto produto6 = new Produto("enchada", 6, 5, 2, 4, "unidade", "utensilio");
		/*Produto produto7 = new Produto("rosa do deserto", 7, 5, 2, 4, "unidade", "planta);
		/*Produto produto8 = new Produto("regador", 8, 5, 2, 4, "unidade", "utensilio"); 
		  
		List<produto> produtos = new ArrayList<produto>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		produtos.add(produto6);
		produtos.add(produto7);
		produtos.add(produto8);
		
		System.out.println("Produto: " + (produtos));
		 */
		 
		
		 
		 
    	/*Produto produto = new Produto(); 
		produto.setNomProd("cactus");
		produto.setCodBar(1);
		produto.setPrecoVen(5);
		produto.setPrecoCus(2);
		produto.setQntEst(4);
		produto.setTipoUn("caixa");
		produto.setCategoria("planta");*/
		
		
		Usuario usuario = new Usuario();
		usuario.setLogin("Joao");
		usuario.setNivPerm(1);
		usuario.setSenha("1234");
		
		
		Venda venda = new Venda();
		venda.setData(new ImplementandoData().dataAtual());
		venda.setId(0);
		venda.setNomCliente("Maria");
		venda.setProdutos(null);
		venda.setUsuario(usuario);
		venda.setValor(0);
		
		/*System.out.println("ID do fornecedor: " + pessoa.getId());
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CNPJ: " + pessoa.getCnpjcpf());
		System.out.println("Rua: " + pessoa.getRua());
		System.out.println("Complemento: " + pessoa.getComp());
		System.out.println("Número: " + pessoa.getNum());
		System.out.println("Bairro: " + pessoa.getBairro());
		System.out.println("Cidade: " + pessoa.getCidade());*/
		
		/*System.out.println("Categoria: " + produto.getCategoria());
		System.out.println("Nome: " + produto.getNomProd());
		System.out.println("Código: " + produto.getCodBar());
		System.out.println("Custo do produto: " + produto.getPrecoCus());
		System.out.println("Preço de venda: " + produto.getPrecoVen());
		System.out.println("Quantidade do estoque: " + produto.getQntEst());*/
					
		/*System.out.println("Data da compra: " + compra.getData());
		System.out.println("Usuario: " + compra.getUsuario());
		System.out.println("Data Entrega da compra: " + compra.getDataEntrega());*/
		
			
				
	}
    }

