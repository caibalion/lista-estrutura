package listaRecursividade;

import java.util.Scanner;

public class MaximoDivisorComum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int m = sc.nextInt();
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        System.out.println(CalculaMDC(m, n));
    }

    public static int CalculaMDC(int m, int n) {
        if (m == 0) {
            return n;
        } else if (n == 0) {
            return m;
        } else {
            return CalculaMDC(n, m % n);
        }
    }

    ;
}
