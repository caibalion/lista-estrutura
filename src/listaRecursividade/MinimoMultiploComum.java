package listaRecursividade;

import java.util.Scanner;

public class MinimoMultiploComum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int a = sc.nextInt();
        System.out.println("Digite um numero: ");
        int b = sc.nextInt();


        int maior = (a > b) ? a : b;

        int resultado = mmc(a, b, maior);
        System.out.println("MMC de " + a + " e " + b + " é: " + resultado);
    }
    public static int mmc(int a, int b, int multiplo) {
        if (multiplo % a == 0 && multiplo % b == 0) {
            return multiplo;
        }
        return mmc(a, b, multiplo + 1);
    }

}
