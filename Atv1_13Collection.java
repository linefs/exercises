package exercises2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atv1_13Collection {

	public static void main(String[] args) {
		int opcao;
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		while(true) {
			System.out.println("**** Escolha uma opção ****");
			System.out.println("\n1 - Adicionar cliente na fila");
			System.out.println("\n2 - Listar todos os clientes");
			System.out.println("\n3 - Retirar cliente da fila");
			System.out.println("\n0 - Sair");	
			opcao = leia.nextInt();
			
			switch (opcao) {
            case 1:
                adicionarCliente(fila, leia);
                break;
            case 2:
                listarClientes(fila);
                break;
            case 3:
                chamarCliente(fila);
                break;
            case 0:
                System.out.println("Programa finalizado.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

    } while (opcao != 0); {

    leia.close();
}

private static void exibirMenu() {
    System.out.println("\n--- Menu ---");
    System.out.println("1: Adicionar Cliente");
    System.out.println("2: Listar Clientes");
    System.out.println("3: Chamar Cliente");
    System.out.println("0: Sair");
}

private static void adicionarCliente(Queue<String> filaClientes, Scanner scanner) {
    System.out.print("Digite o nome do Cliente: ");
    String nomeCliente = scanner.nextLine();
    filaClientes.add(nomeCliente);
    System.out.println("Cliente adicionado à fila.");
}

private static void listarClientes(Queue<String> filaClientes) {
    if (filaClientes.isEmpty()) {
        System.out.println("A fila está vazia.");
    } else {
        System.out.println("Clientes na fila:");
        for (String cliente : filaClientes) {
            System.out.println(cliente);
        }
    }
}

private static void chamarCliente(Queue<String> filaClientes) {
    if (filaClientes.isEmpty()) {
        System.out.println("A fila está vazia. Não é possível chamar um cliente.");
    } else {
        String clienteChamado = filaClientes.poll();
        System.out.println("Cliente chamado: " + clienteChamado);
    }
}

			
		
	}

