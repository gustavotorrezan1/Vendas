package util;

public class Usuario {

	protected String login;
    protected String senha;
    protected int nivPerm;
    
    
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getNivPerm() {
		return nivPerm;
	}
	public void setNivPerm(int nivPerm) {
		this.nivPerm = nivPerm;
	}
    
    
}