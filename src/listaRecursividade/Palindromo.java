package listaRecursividade;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva qualquer coisa: ");
        String s = sc.nextLine();
        if (isPalindromo(s)) {
            System.out.println("É um palindromo");
        } else {
            System.out.println("Não é um palindromo");
        }
    }

    public static boolean isPalindromo(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        return verificar(str, 0, str.length() - 1);
    }

    private static boolean verificar(String str, int esquerda, int direita) {
        if (esquerda >= direita) {
            return true;
        } else if (str.charAt(esquerda) != str.charAt(direita)) {
            return false;
        } else {
            return verificar(str, esquerda + 1, direita - 1);
        }
    }

}
