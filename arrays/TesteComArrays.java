package arrays;

public class TesteComArrays {

	public static void main(String[] args) {

		// unideimensional => vetor
		int[] idades = { 1, 5, 7, 80, 45 }; // já esta inicializado -> pois já tem valores
		int[] idade2 = new int[5]; // não possui dados escritos pelo usuário, pode armazenar até 5 informações

		String[] nomes = { "Julia", "Marcia", "Ana" };
		String[] nomes2 = new String[3];

		// quero imprimir uma idade e um nome

		System.out.println("Idade: " + idades[3] + " - Nome: " + nomes[0] + "\n");
		System.out.println("===================================" + "\n");

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Idades: " + idades[i] + "\n");

		}

		System.out.println("==============================" + "\n");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nomes: " + nomes[i] + "\n");

		}
		System.out.println("==============================" + "\n");

		//multidimensionais => matriz
		//int[linha][coluna]
		
				int[][] numeros = new int[3][3];
				int valor = 1;
				for (int linha = 0; linha < 3; linha++) {
					for (int coluna = 0; coluna < 3; coluna++) {
						numeros[linha][coluna] = valor++;
					}
				}
				
				
				for (int linha = 0; linha < 3; linha++) {
					for (int coluna = 0; coluna < 3; coluna++) {
					System.out.print(numeros[linha][coluna] + "\t");
					}
					System.out.println();
				}
				
				System.out.println(numeros[0][2]);
				
				int[][]randomicos = {{8,12,78,96},
												{22,79,85,92}};
				}
		}