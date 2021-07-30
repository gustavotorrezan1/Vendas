package javaapplication1;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Compra {
    private int id;
    private Usuario usuario;
    private double valor;
    private List<Produto> produtos = new ArrayList<Produto>();
    private int status;
    private Date data;   //LocalDateTime
    private Date dataEntrega;
    private Date dataFinal;
}
          

