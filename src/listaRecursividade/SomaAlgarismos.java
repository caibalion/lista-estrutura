package listaRecursividade;

import java.util.Scanner;

public class SomaAlgarismos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        System.out.print(somaAlgarismos(num));

    }

    public static int somaAlgarismos(int num) {
        if (num >= 0 && num <= 9) {
            return num;
        } else {
            return (num % 10) + somaAlgarismos(num / 10);
        }
    }
}
