package Avaliativa1;

import java.util.Scanner;

public class ImplementaListaNumeros {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 10 números inteiros e positivos:");
        for (int i = 0; i < 10; i++) {
            int numero;
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                numero = sc.nextInt();

                if (numero > 0 && numero % 2 == 0) {
                    lista.adicionar(new Numero(numero));
                    break;
                } else {
                    System.out.println("Número inválido! Apenas números pares e positivos são aceitos.");
                }
            }
        }

        // Exibe a lista
        System.out.println("\nLista Encadeada de Números Pares:");
        lista.listar();

        System.out.print("Deseja remover o último número da lista? (s/n): ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's' || resposta == 'S') {
            lista.remover();
            System.out.println("Último número removido com sucesso!");

            System.out.println("\nLista após remoção:");
            lista.listar();
        }


    }
}
