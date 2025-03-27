package listaRecursividade;

import java.util.Scanner;

public class ContaChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a String: ");
        String str = sc.nextLine();
        System.out.println("Informe o char a ser analisado: ");
        char c = sc.next().charAt(0);
        System.out.println(contarChar(str, c, 0));
    }

    public static int contarChar(String str, char c, int index) {
        if (index == str.length()) {
            return 0;
        } else {
            int soma = (str.charAt(index) == c) ? 1 : 0;
            return soma + contarChar(str, c, index + 1);
        }
    }

}
