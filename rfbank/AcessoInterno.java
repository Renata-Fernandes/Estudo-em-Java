package rfbank;

public interface AcessoInterno {

	//os métodos não tem comportamento (corpo), só tem assinatura
	
	/**
	 * @param String usuario => pode-se informar um usuário válido
	 * @param String senha => pode-se informar uma senha com até 225 caracteres alfanuméricos
	 * @return retorna verdadeiro quando a senha estiver correta
	 */
	
	public boolean autenticarSistema(String usuario, String senha);
	public boolean mudarSenha(String senhaAntiga, String senhaNova);
	public boolean mudarUsuario(String usuarioAntigo, String usuarioNovo);
	
	
}
