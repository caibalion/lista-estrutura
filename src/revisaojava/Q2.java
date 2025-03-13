package revisaojava;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        a = sc.nextInt();
        System.out.print("Enter an integer: ");
        b = sc.nextInt();
        if(a == b){
            System.out.println(a + " is equal to " + b);
        }else if(a>b){
            System.out.println(a + " is greater than " + b);
        }else {
            System.out.println(a + " is less than " + b);
        }
    }
}
