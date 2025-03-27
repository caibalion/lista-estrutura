package listaRecursividade;

import java.util.Scanner;

//Q8
public class SomaNaturais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        System.out.print(somaNaturais(n));

    }

    public static int somaNaturais(int n) {
        if (n == 0) {
            return 0;
        }else {
            return n + somaNaturais(n - 1);
        }
    }


}

