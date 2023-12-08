package exercises;

import java.util.Scanner;

public class Atv2_0812 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int npar = 0;
		int nimp = 0;
		
		System.out.println("Digite 10 números inteiros: ");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Número " + (i + 1) + ": ");
			int num = scanner.nextInt();
			
			if (num % 2 == 0) {
                npar++;
                
            } else {
                nimp++;
            }
        }

        System.out.println("Quantidade de números pares: " + npar);
        System.out.println("Quantidade de números ímpares: " + nimp);

        scanner.close();
    }
}
			
