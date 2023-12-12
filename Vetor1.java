package exercises;

import java.util.Arrays;

public class Vetor1 {

	public static void main(String[] args) {
		// Atividade 1 -> Vetores com 10 números inteiros 
		// não ordenados e não repetidos 
		// O usuário digita o número e o vetor exibe a posição
		// Caso o número não seja encontrado: Não foi encontrado
		
		int vetInt[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		Arrays.sort(vetInt);
		
		for (int i = 0; i < vetInt.length; i++) {
			System.out.println("\nDigite o número que deseja encontrar?");
		}
		
		
		int localizar = Arrays.binarySearch(vetInt, 10);
		
		if (localizar >= 0 )
			System.out.println("\nO elemento foi Encontrado e está na Posição: " + localizar);
		else
			System.out.println("\nElemento não encontrado!");
		
		

	}

}
