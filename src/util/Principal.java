/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;

/**
 Classe main
 * 
 */
import javax.swing.JOptionPane;



public class Principal {
    public static void main (String[] args) {
		
    	String login = JOptionPane.showInputDialog("Informe o login");
    	String senha = JOptionPane.showInputDialog("Informe a senha");
    	
    	if(login.equalsIgnoreCase("admin") &&
    			senha.equalsIgnoreCase("admin")){
    	
    	String escolha = JOptionPane.showInputDialog("Digite: \n1 - para COMPRA \n2 - para VENDA");
        if(escolha.equalsIgnoreCase("1")) {
        	
        	// Compra
        	String idCompra = JOptionPane.showInputDialog("Id compra?");
        	String valor = JOptionPane.showInputDialog("Qual o valor?");
        	Compra compra = new Compra();
    		compra.setId(Integer.valueOf(idCompra)); 
    		compra.setValor(Integer.valueOf(valor));
    		compra.setData(new ImplementandoData().dataAtual());
    		compra.setDataEntrega(new ImplementandoData().dataEntrega());
    		
    		// Fornecedor						
    		String idPessoa = JOptionPane.showInputDialog("Qual o ID do fornecedor?");
    		String nome = JOptionPane.showInputDialog("Qual o nome do fornecedor?");
    		String cnpjCpf = JOptionPane.showInputDialog("Qual o CNPJ/CPF?");
    		String rua = JOptionPane.showInputDialog("Qual a rua?");
    		String comp = JOptionPane.showInputDialog("Qual o complemento?");
    		String num = JOptionPane.showInputDialog("Qual o num?");
    		String bairro = JOptionPane.showInputDialog("Qual bairro?");
    		String cidade = JOptionPane.showInputDialog("Qual cidade?");
    		String estado = JOptionPane.showInputDialog("Qual estado?");
    		String cep = JOptionPane.showInputDialog("Qual cep?");
    		String telef1 = JOptionPane.showInputDialog("Qual telef1?");
    		
    		
    		// Pessoa
    		Fornecedor fornecedor = new Fornecedor();
    		fornecedor.setId(Integer.valueOf(idPessoa));
    		fornecedor.setNome(nome);
    		fornecedor.setCnpjcpf(cnpjCpf);
    		fornecedor.setRua(rua);
    		fornecedor.setComp(comp);
    		fornecedor.setNum(Integer.valueOf(num));
    		fornecedor.setBairro(bairro);
    		fornecedor.setCidade(cidade);
    		fornecedor.setEstado(estado);
    		fornecedor.setCep(cep);
    		fornecedor.setTelefone1(telef1);
    		
    		// Mostrar Compra
    		System.out.println("ID da compra: " + compra.getId());
    		System.out.println("Usuario responsável: " + compra.getUsuario());
    		System.out.println("Produdos: " + compra.getProdutos());
    		System.out.println("Status: " + compra.getStatus());
    		System.out.println("Data da compra: " + compra.getData());
    		System.out.println("Data Entrega da compra: " + compra.getDataEntrega());
    		

    		System.out.println("ID do fornecedor: " + fornecedor.getId());
    		System.out.println("Nome: " + fornecedor.getNome());
    		System.out.println("CNPJ: " + fornecedor.getCnpjcpf());
    		System.out.println("Rua: " + fornecedor.getRua());
    		System.out.println("Complemento: " + fornecedor.getComp());
    		System.out.println("Número: " + fornecedor.getNum());
    		System.out.println("Bairro: " + fornecedor.getBairro());
    		System.out.println("Cidade: " + fornecedor.getCidade());
    		
        }
        
        if(escolha.equalsIgnoreCase("2"))  {
        	
        	// Venda
        	String idVenda = JOptionPane.showInputDialog("Id Venda?");
        	String valor = JOptionPane.showInputDialog("Qual o valor?");    		
    		Venda venda = new Venda();
    		venda.setId(Integer.valueOf(idVenda)); 
    		venda.setValor(Integer.valueOf(valor));
    		venda.setData(new ImplementandoData().dataAtual());
    		
    		
    		/*
    		 Venda venda = new Venda();
    		 venda.setData(new ImplementandoData().dataAtual());
    		 venda.setId(0);
    		 venda.setNomCliente(usuario.getLogin());
    		 venda.setUsuario(usuario);
             venda.setProdutos( new Produtos().listaProdutos());
             venda.setValor(0);
		
                double valor = 0;
                int idCompra = 0;
                System.out.println("PRODUTOS E QUANTIDADES ");
                 
                  for(Produto x : venda.getProdutos() ) {
                    
                   
                    String produto = JOptionPane. showInputDialog(x.nomProd);
                     String quant = JOptionPane.showInputDialog("quantidade?");
                     System.out.println( x.nomProd + " quantidade = " + quant );
                     
                     valor += x.precoVen;
                 }
              */    
    		
    		// Cliente						
    		String idPessoa = JOptionPane.showInputDialog("Qual o ID do cliente?");
    		String nome = JOptionPane.showInputDialog("Qual o nome do cliente?");
    		String cnpjCpf = JOptionPane.showInputDialog("Qual o CNPJ/CPF?");
    		String rua = JOptionPane.showInputDialog("Qual a rua?");
    		String num = JOptionPane.showInputDialog("Qual o num?");
    		String comp = JOptionPane.showInputDialog("Qual o complemento?");
    		String bairro = JOptionPane.showInputDialog("Qual bairro?");
    		String cidade = JOptionPane.showInputDialog("Qual cidade?");
    		String estado = JOptionPane.showInputDialog("Qual estado?");
    		String cep = JOptionPane.showInputDialog("Qual cep?");
    		String telef1 = JOptionPane.showInputDialog("Qual telef1?");
    		
    		// Pessoa
    		
    		Cliente cliente = new Cliente();
    		cliente.setId(Integer.valueOf(idPessoa));
    		cliente.setNome(nome);
    		cliente.setCnpjcpf(cnpjCpf);
    		cliente.setRua(rua);
    		cliente.setComp(comp);
    		cliente.setNum(Integer.valueOf(num));
    		cliente.setBairro(bairro);
    		cliente.setCidade(cidade);
    		cliente.setEstado(estado);
    		cliente.setCep(cep);
    		cliente.setTelefone1(telef1);
    		
    		// Usuario
    		Usuario usuario = new Usuario();
    		usuario.setLogin("Joao");
    		usuario.setNivPerm(1);
    		
    		// Mostrar Usuário
    		System.out.println("DADOS DO USUÁRIO");
    		System.out.println("Usuário:"+ usuario.getLogin());
    		System.out.println("Nivel de Permissão: " + usuario.getNivPerm() + " Gerente");
    		
    		// Mostrar Venda
    		System.out.println("----------------------------------------------------------------");
    		System.out.println("DADOS DA PRODUTO");
    		System.out.println("ID da venda: " + venda.getId());
    		System.out.println("Valor da Venda: " + venda.getValor());
    		System.out.println("Produdos: " + venda.getProdutos());
    		System.out.println("Data da compra: " + venda.getData());
    		
    		// Mostrar Cliente
    		System.out.println("----------------------------------------------------------------");
    		System.out.println("DADOS DO CLIENTE");
    		System.out.println("ID do Cliente: " + cliente.getId());
    		System.out.println("Nome: " + cliente.getNome());
    		System.out.println("CNPJ: " + cliente.getCnpjcpf());
    		System.out.println("Rua: " + cliente.getRua());
    		System.out.println("Complemento: " + cliente.getComp());
    		System.out.println("Número: " + cliente.getNum());
    		System.out.println("Bairro: " + cliente.getBairro());
    		System.out.println("Cidade: " + cliente.getCidade());
        	
    
    }
    		
    }
    	
		/*
				
		String cupomDesconto = JOptionPane.showInputDialog("Qual Desconto ?");
		String ponto = JOptionPane.showInputDialog("Qual pontos?");
		
		Cliente cliente = new Cliente();
		cliente.setCupomDesconto(Integer.valueOf(cupomDesconto));
		cliente.setPontos(Integer.valueOf(ponto));
				
		// Produto
    	Produto produto = new Produto("cactus", 1, 5, 2, 4, "caixa", "planta"); 
		produto.setNomProd("cactus");
		produto.setCodBar(1);
		produto.setPrecoVen(5);
		produto.setPrecoCus(2);
		produto.setQntEst(4);
		produto.setTipoUn("caixa");
		produto.setCategoria("planta");
		
			
		
		System.out.println("Categoria: " + produto.getCategoria());
		System.out.println("Nome: " + produto.getNomProd());
		System.out.println("Código: " + produto.getCodBar());
		System.out.println("Custo do produto: " + produto.getPrecoCus());
		System.out.println("Preço de venda: " + produto.getPrecoVen());
		System.out.println("Quantidade do estoque: " + produto.getQntEst());
		
		
		
		
		*/
			
				
	}
}


