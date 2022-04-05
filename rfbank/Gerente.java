package rfbank;

import java.time.LocalDate;

public class Gerente extends Funcionario implements AcessoInterno{

	//mockado - quando vai fazer um teste e já coloca um valor no atributo para ver se esta ok
	private String usuario = "usuariopadrao";
	private String senha = "mudar123";
	
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String cpf, String ctps, double salario, LocalDate dataDeAdmissao) {
		super(nome, cpf, ctps, salario, dataDeAdmissao);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBonus() {
		return this.getSalario()*0.1;
	}

	@Override
	public boolean autenticarSistema(String usuario, String senha) {
		if(this.usuario.equals(usuario) && this.senha.equals(senha)) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean mudarSenha(String senhaAntiga, String senhaNova) {
		if(this.senha.equals(senhaAntiga) && senhaNova.length() <= 8) {
			this.senha = senhaNova;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean mudarUsuario(String usuarioAntigo, String usuarioNovo) {
		if(this.usuario.equals(usuarioAntigo) && usuarioNovo.length() <=12) {
			this.usuario = usuarioNovo;
			return true;	
		}
		return false;
	}
	
	
}
