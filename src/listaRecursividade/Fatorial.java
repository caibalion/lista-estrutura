package listaRecursividade;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println(fatorial(num));
    }

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fatorial(num - 1);
        }
    }
}
