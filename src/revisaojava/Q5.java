package revisaojava;

import java.util.Scanner;

public class Q5 {


    public static void main(String[] args) {
        int a, b;
        String nome;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        nome = sc.nextLine();
        System.out.print("Informe a quantidade mínima do produto: ");
        a = sc.nextInt();
        System.out.print("Informe a quantidade máxima do produto: ");
        b = sc.nextInt();
        calcEst(a, b, nome);
    }

    static void calcEst(int a, int b, String nome) {
        System.out.println("Estoque médio do produto " + nome + " = " + (a + b) / 2);
    }
}
