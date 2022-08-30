package cursojava.interfaces;
/* Interface como contrato de autenticação */
public interface PermitirAcesso {
	
	
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar ();

}
