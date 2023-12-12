package exercises;

import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o vetor para armazenar os números
        int[] vetor = new int[10];

        // Lendo os 10 números e armazenando no vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Mostrando todos os elementos dos índices ímpares do vetor
        System.out.println("Elementos nos índices ímpares:");
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Índice " + i + ": " + vetor[i]);
        }

        // Mostrando todos os elementos do vetor que são números pares
        System.out.println("\nNúmeros pares no vetor:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }

        // Calculando a soma de todos os elementos do vetor
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i];
        }
        System.out.println("\nSoma de todos os elementos do vetor: " + soma);

        // Calculando a média de todos os elementos do vetor
        double media = (double) soma / 10;
        System.out.println("Média de todos os elementos do vetor: " + media);
    }
}
