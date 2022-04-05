package rfbank;

import java.time.LocalDate;
import java.util.Locale;


public class TesteBanco {

	public static void main(String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa (); //criar uma instância ou seja uma cópia
//		pessoaNumero1.nome = "Aurora";
//		pessoaNumero1.profissao = "Historiadora";
//		pessoaNumero1.cpf = "462.086.330-01";
//		
//				
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Profissão: " + pessoaNumero1.profissao);
//		System.out.println("CPF: " + pessoaNumero1.cpf + "\n");
//		
//		Pessoa pessoaNumero2 = pessoaNumero1;
//		pessoaNumero2.nome = "Hermione";
//		
//		System.out.println("===============================" + "\n");
//		
//		System.out.println("Nome: " + pessoaNumero2.nome);
//		System.out.println("Nome: " + pessoaNumero1.nome);
		

		
		
//		Pessoa pessoaNova = new Pessoa(); //instanciar a classe Pessoa
//		pessoaNova.setNome("Aurora");
//		System.out.println("Nome: " + pessoaNova.getNome() + "\n");
//		
//		Pessoa pessoaComConstrutor1 = new Pessoa ("Hermione", "594.672.960-80", "27.216.237-1");
//		
//		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
//		System.out.println("CPF: " + pessoaComConstrutor1.getCpf());
//		System.out.println("RG: " + pessoaComConstrutor1.getRg());
		
		Locale.setDefault(new Locale ("pt" , "BR")); //serve para impressão de data e moeda de acordo com o país
		Gerente funcionario = new Gerente ("Aurora", "414.785.309-95", "87759", 2500.0, LocalDate.now());
		
		System.out.println(funcionario.toString());
		System.out.printf("Bonus: %.2f \n", funcionario.getBonus());
		
		boolean resposta = funcionario.autenticarSistema("usuariopadrao", "mudar123");
		
		if(resposta)
			System.out.println("Bem vindo(a)" + funcionario.getNome());
		else
			System.out.println("Usuário ou senha inválidos");
	
			
	}
}
