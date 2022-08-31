package curso.java.classeauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*somente receber alguém que tenha o contrato da interface de PermitirAcesso e chamar o autenticar. */
public class FuncaoAutenticacao {
	
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
