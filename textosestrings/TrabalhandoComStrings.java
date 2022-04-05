package textosestrings;

public class TrabalhandoComStrings {
	
	public static void main(String[] args) {
		
	System.out.println("============Caracter============ \n");	
	
	//metodos s�o da Classe Character
		
	//verificar se o valor � um n�mero  e retorna true ou false
		
	System.out.println("Esse caractere � um n�mero: 5 " + Character.isDigit('5'));
	System.out.println("Esse caractere � um n�mero: a " + Character.isDigit('a'));
		
	System.out.println("\n ============================ \n");
		
	//verifica se o valor � uma letra e retorna true ou false
		
	System.out.println("Esse caractere � uma letra: f " + Character.isLetter('f'));
	System.out.println("Esse caractere � uma letra: 6 " + Character.isLetter('6'));
	
	System.out.println("\n ============================ \n");
	
	//verificar se o valor � uma letra ou n�mero e retorna true ou false
	
	System.out.println("Esse caractere � uma letra ou n�mero: c " +Character.isLetterOrDigit('c'));
	System.out.println("Esse caractere � uma letra ou n�mero: 5 " +Character.isLetterOrDigit('5'));
	System.out.println("Esse caractere � uma letra ou n�mero: @ " +Character.isLetterOrDigit('@'));
	
	System.out.println("\n ============================ \n");
	
	//verificar se o valor est� escrito com caracter maiusculo
	
	System.out.println("Esta escrito em mai�sculo: c " + Character.isUpperCase('c'));
	System.out.println("Esta escrito em mai�sculo: A " + Character.isUpperCase('A'));
	
	System.out.println("\n ============================ \n");
	
	//verificar se o valor est� escrito com caracter minusculo
	
	System.out.println("� escrito com letra min�scula: P " + Character.isLowerCase('P'));
	System.out.println("� escrito com letra min�scula: i " + Character.isLowerCase('i'));
	
	System.out.println("\n ============================ \n");
	
	//verificar se o valor � um espa�o em branco
	
	System.out.println("Tem um espa�o: " + Character.isWhitespace(' '));
	
	System.out.println("\n ============String============ \n");
	
	//String

	String arquivo = "escola.java";
	//verifica valor antigo e substitui pelo valor novo
	arquivo = arquivo.replace("java", "class");
	
	System.out.println("Trocar escola.java para escola.class");
	System.out.println(arquivo);
	
	System.out.println("\n ============================ \n");
	
	//compara 2 valores
	String nome1 = "aurora";
	String nome2 = "Aurora";
	
	//Compara conte�do e caracteres ma�usculo e min�sculo
	System.out.println(nome1.equals(nome2));
	
	System.out.println("\n ============================ \n");
	
	//Compara conte�do do texto
	System.out.println(nome1.equalsIgnoreCase(nome2));
	
	System.out.println("\n ============================ \n");
	
	//verifica se inicia exatamente na mesma sequencia de caracteres
	System.out.println(nome1.startsWith("aur"));
	System.out.println(nome1.startsWith("Aur"));
	
	System.out.println("\n ============================ \n");
	
	//verifica se termina exatamente com a mesma sequencia de caracteres
	System.out.println(nome1.endsWith("ora"));
	System.out.println(nome1.endsWith("aur"));
	
	System.out.println("\n ============================ \n");
	
	//compara as letras uma a uma
	//muito usado para colocar em ordem alfab�tica
	//associado a colections
	System.out.println(nome1.compareTo(nome2));
	
	System.out.println("\n ============================ \n");
	
	//verifica o tamanho  da string
	System.out.println("Tamanho da string: " + nome1.length());
	
	System.out.println("\n ============================ \n");
	
	//mostra o valor armazenado num determinado indice
	System.out.println("Letra que esta na posi��o 4: " + nome1.charAt(4));
	
	System.out.println("\n ============================ \n");
	
	//retorna uma parte de uma string (informar in�cio e fim)
	System.out.println("Retornar da string a posi��o de 2 � 4: " + nome1.substring(2, 4)); //aqui ele pega o ultimo valor -1
	
	System.out.println("\n ============================ \n");
	
	//retorna a posi��o da primeira ocorr�ncia de uma letra
	System.out.println("Posi��o que aparece o primeiro r: " + nome1.indexOf("r"));
	
	System.out.println("\n ============================ \n");
	
	//retorna a posi��o da �ltima ocorr�ncia de uma letra
	System.out.println("Posi��o do �ltimo r: " + nome1.lastIndexOf("r"));
	
	
	}

}
