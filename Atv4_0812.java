package exercises;

import java.util.Scanner;

public class Atv4_0812 {

	public static void main(String[] args) {
	   
	        Scanner scanner = new Scanner(System.in);

	        int numero;
	        int soma = 0;

	        System.out.println("Digite números inteiros (digite 0 para encerrar):");

	        do {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();

	            if (numero > 0) {
	                soma += numero;
	            }

	        } while (numero != 0);

	        System.out.println("A soma dos números positivos digitados é: " + soma);

	        scanner.close();
	   

	}

}
