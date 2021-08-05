package util;
import java.util.Date;

public class Produto  {
	    public String nomProd;
	    public int codBar;
	    public float precoVen;
	    private float precoCus;
	    private int qntEst;
	    public String tipoUn;
	    public String categoria;
            private Date dataDeValidade;

   
		public String getNomProd() {
			return nomProd;
		}
		public void setNomProd(String nomProd) {
			this.nomProd = nomProd;
		}
		public int getCodBar() {
			return codBar;
		}
		public void setCodBar(int codBar) {
			this.codBar = codBar;
		}
		public float getPrecoVen() {
			return precoVen;
		}
		public void setPrecoVen(float precoVen) {
			this.precoVen = precoVen;
		}
		public float getPrecoCus() {
			return precoCus;
		}
		public void setPrecoCus(float precoCus) {
			this.precoCus = precoCus;
		}
		public int getQntEst() {
			return qntEst;
		}
		public void setQntEst(int qntEst) {
			this.qntEst = qntEst;
		}
		public String getTipoUn() {
			return tipoUn;
		}
		public void setTipoUn(String tipoUn) {
			this.tipoUn = tipoUn;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

              
                public Date getDataDeValidade() {
                    return dataDeValidade;
                }

                public void setDataDeValidade( Date dataDeValidade) {
                    this.dataDeValidade = dataDeValidade;
                   
                }

  

                    } 
   
