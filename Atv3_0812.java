package exercises;

import java.util.Scanner;

public class Atv3_0812 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		
		System.out.println("Digite 10 números inteiros: ");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Número " + (i + 1) + ": ");
			int num = scanner.nextInt();
			
			if (num % 2 == 0) {
                n1++;
                
            } else {
                n1++;
            }
        }

        System.out.println("Quantidade de números pares: " + n1);
        System.out.println("Quantidade de números ímpares: " + n2);

        scanner.close();
    }
}
			
