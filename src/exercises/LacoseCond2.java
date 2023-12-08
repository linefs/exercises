package exercises;

import java.util.Scanner;

public class LacoseCond2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao, quantidade;
		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para Cachorro Quente, R$ 10 un.--");
		System.out.println("--Digite 2 para X-Salada, R$ 15 un. --");
		System.out.println("--Digite 3 para X-Bacon, R$ 18 un.--");
		System.out.println("--Digite 4 para Bauru, R$ 12 un.--");
		System.out.println("--Digite 5 Refrigerante, R$ 8 un.--");
		System.out.println("--Digite 6 para Suco de Laranja, R$ 13 u.--");
		
		System.out.println("__________________________________________");
		
		System.out.println("Digite o código do produto:");
		opcao = leia.nextInt();
		
		System.out.println("Digite a quantidade:");
		quantidade = leia.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor total da compra: " + (quantidade * 10.00));
		break;
		case 2:
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total da compra: " + (quantidade * 15.00));
		break;	
		case 3:
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor total da compra: " + (quantidade * 18.00));
		break;
		case 4:
			System.out.println("Produto: Bauru");
			System.out.println("Valor total da compra: " + (quantidade * 12.00));
		break;	
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total da compra: " + (quantidade * 8.00));
		break;		
		case 6:
			System.out.println("Produto: Suco de Laranja");
			System.out.println("Valor total da compra: " + (quantidade * 13));
			
			
		
		}
		
		
		
		
		

	}

}
