package listaRecursividade;

import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a String: ");
        String s = sc.nextLine();
        System.out.println(inverter(s));
    }

    public static String inverter(String str) {
        if (str.isEmpty()) {
            return "";
        }else {
            return inverter(str.substring(1)) + str.charAt(0);
        }
    }

}
