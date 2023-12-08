package exercises;

import java.util.Scanner;

public class LacoseCond1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float na, nb, nc, soma;
		Scanner leia = new Scanner(System.in);
				
		System.out.println("Digite o número A: ");
		na = leia.nextFloat();
				
		System.out.println("Digite o número B: ");
		nb = leia.nextFloat();
				
		System.out.println("Digite número C: ");
		nc = leia.nextFloat();
				
		soma = (na + nb);
	
				
		if(soma > nc); {
		System.out.println("A soma de A + B, é maior que C.");

	}

}
}
