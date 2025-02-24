import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        a = sc.nextInt();
        System.out.println("Digite um numero: ");
        b = sc.nextInt();
        if(a>b){
            System.out.println(
                    a + " é maior que " + b + "."
            );
        }else   if(b>a){
            System.out.println(b + " é maior que " + a + ".");
        }else {
            System.out.println("Os valores são iguais");
        }
    }
}
