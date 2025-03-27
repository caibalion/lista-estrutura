package listaRecursividade;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        contagem(num);
    }

    public static void contagem(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        contagem(n - 1);
    }
}
