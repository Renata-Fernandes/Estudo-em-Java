package textosestrings;

public class TrabalhandoComStrings {
	
	public static void main(String[] args) {
		
	System.out.println("============Caracter============ \n");	
	
	//metodos são da Classe Character
		
	//verificar se o valor é um número  e retorna true ou false
		
	System.out.println("Esse caractere é um número: 5 " + Character.isDigit('5'));
	System.out.println("Esse caractere é um número: a " + Character.isDigit('a'));
		
	System.out.println("\n ============================ \n");
		
	//verifica se o valor é uma letra e retorna true ou false
		
	System.out.println("Esse caractere é uma letra: f " + Character.isLetter('f'));
	System.out.println("Esse caractere é uma letra: 6 " + Character.isLetter('6'));
	
	System.out.println("\n ============================ \n");
	
	//verificar se o valor é uma letra ou número e retorna true ou false
	
	System.out.println("Esse caractere é uma letra ou número: c " +Character.isLetterOrDigit('c'));
	System.out.println("Esse caractere é uma letra ou número: 5 " +Character.isLetterOrDigit('5'));
	System.out.println("Esse caractere é uma letra ou número: @ " +Character.isLetterOrDigit('@'));
	
	System.out.println("\n ============================ \n");
	
	//verificar se o valor está escrito com caracter maiusculo
	
	System.out.println("Esta escrito em maiúsculo: c " + Character.isUpperCase('c'));
	System.out.println("Esta escrito em maiúsculo: A " + Character.isUpperCase('A'));
	
	System.out.println("\n ============================ \n");
	
	//verificar se o valor está escrito com caracter minusculo
	
	System.out.println("É escrito com letra minúscula: P " + Character.isLowerCase('P'));
	System.out.println("É escrito com letra minúscula: i " + Character.isLowerCase('i'));
	
	System.out.println("\n ============================ \n");
	
	//verificar se o valor é um espaço em branco
	
	System.out.println("Tem um espaço: " + Character.isWhitespace(' '));
	
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
	
	//Compara conteúdo e caracteres maíusculo e minúsculo
	System.out.println(nome1.equals(nome2));
	
	System.out.println("\n ============================ \n");
	
	//Compara conteúdo do texto
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
	//muito usado para colocar em ordem alfabética
	//associado a colections
	System.out.println(nome1.compareTo(nome2));
	
	System.out.println("\n ============================ \n");
	
	//verifica o tamanho  da string
	System.out.println("Tamanho da string: " + nome1.length());
	
	System.out.println("\n ============================ \n");
	
	//mostra o valor armazenado num determinado indice
	System.out.println("Letra que esta na posição 4: " + nome1.charAt(4));
	
	System.out.println("\n ============================ \n");
	
	//retorna uma parte de uma string (informar início e fim)
	System.out.println("Retornar da string a posição de 2 à 4: " + nome1.substring(2, 4)); //aqui ele pega o ultimo valor -1
	
	System.out.println("\n ============================ \n");
	
	//retorna a posição da primeira ocorrência de uma letra
	System.out.println("Posição que aparece o primeiro r: " + nome1.indexOf("r"));
	
	System.out.println("\n ============================ \n");
	
	//retorna a posição da última ocorrência de uma letra
	System.out.println("Posição do último r: " + nome1.lastIndexOf("r"));
	
	
	}

}
