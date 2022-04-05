package textosestrings;

public class TesteEmail {

	public static void main(String[] args) {
		
		ExpressoesRegulares emailValido = new ExpressoesRegulares("teste@teste.com.br");
		System.out.println("Email: " + emailValido.getEmail());
		
		ExpressoesRegulares emailInvalido = new ExpressoesRegulares("testeteste.com.br");
		
		ExpressoesRegulares2 telefoneValido = new ExpressoesRegulares2("11", "111111111");
		System.out.println(telefoneValido.toString());
		
		ExpressoesRegulares2 dddInvalido = new ExpressoesRegulares2("150", "111111111");
		ExpressoesRegulares2 numeroInvalido = new ExpressoesRegulares2("11", "111111");
	}
}
