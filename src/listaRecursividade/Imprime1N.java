package listaRecursividade;

import java.util.Scanner;

public class Imprime1N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        imprimeNums(n);
    }

    public static void imprimeNums(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        imprimeNums(n - 1);
        System.out.println(n);


    }
}
