package exercises;

import java.util.Scanner;

public class Atv5_0812 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        System.out.println("Digite números inteiros (digite 0 para encerrar):");

        while (true) {
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 3 == 0) {
                soma += numero;
                contador++;
            }
        }

        scanner.close();

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média dos múltiplos de 3: " + media);
        } else {
            System.out.println("Nenhum múltiplo de 3 foi digitado.");
        }
    }
}