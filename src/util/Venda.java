package javaapplication1;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Venda {
    private int id;
    private Usuario usuario;
    private double valor;
    private List<Produto> produtos = new ArrayList<Produto>();
    private Date data = new Date();
    private String nomCliente;
    
}
