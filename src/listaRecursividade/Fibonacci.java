package listaRecursividade;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a posição desejada: ");
        System.out.print(calcFibo(sc.nextInt()));
    }


    public static int calcFibo(int p) {
        if (p == 1) {
            return 0;
        } else if (p == 2) {
            return 1;
        } else {
            return calcFibo(p - 1) + calcFibo(p - 2);
        }
    }
}
