package rfbank;

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
		
		
		PessoaFisica pfAurora = new PessoaFisica();
		pfAurora.setNome("Aurora");
		pfAurora.setEmail("aurora@aurora.com");
		pfAurora.setTelefone("123456789");
		pfAurora.setCpf("788.814.519-13");
		pfAurora.setProfissao("Astronauta");
		pfAurora.setRg("13.727.985-1");
		
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		//conta1.setSaldo(1000000.99); não se deve operar diretamente essa info. Ela apenas pode ser exibida
		conta1.setTitular(pfAurora);
		
		conta1.depositar(5000.87);
		
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getNumeroConta());
		System.out.println("Titular: " + conta1.getTitular().getNome());
		System.out.printf("Saldo: R$ %.2f \n" , conta1.getSaldo());
		
		if(conta1.sacar(50.00)) {
			System.out.println("Saque efetuado com sucesso!" + "\n");
			
		}else {
			System.out.println("Verifique valor do saque!" + "\n");
		}
				
		System.out.println("Saldo Atual: R$ " + conta1.getSaldo()); //exemplo sem o %.2f
		
		Conta conta2 = new Conta();
			conta2.setAgencia(5369);
			conta2.setNumeroConta(4281);
			
			conta1.transferir(150, conta2);
			System.out.printf("Saldo Aurora pós transferência: R$ %.2f \n" , conta1.getSaldo());
			System.out.printf("Saldo Atual Herminone: R$ %.2f \n" , conta2.getSaldo());
			
			System.out.println("==================================" + "\n");
			
			ContaCorrente cc1 = new ContaCorrente();
			cc1.depositar(2000);
			System.out.println("Saldo: " + cc1.getSaldo());
			System.out.println("Limite: " + cc1.getLimite());
			System.out.println("Total: " + cc1.getSaldoComLimite());
			cc1.sacar(3000);
			System.out.println("Saldo: " + cc1.getSaldo());
			System.out.println("Saldo com Limite: " + cc1.getSaldoComLimite());
			
	}
}
