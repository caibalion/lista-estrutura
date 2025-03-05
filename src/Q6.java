import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        String nome;
        double altura;
        int sexo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite seu sexo: \n1 - Masculino\n2 - Feminino \n");
        sexo = sc.nextInt();
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();
        calcIMC(nome, altura, sexo);
    }

    public static void calcIMC(String nome, double altura, int sexo) {
        double IMC;
        if (sexo == 2) {
            IMC = (62.1 * altura) - 44.7;
            System.out.println(nome + " IMC = " + String.format("%.2f", IMC) + "kg");
        } else {
            IMC = (72.7 * altura) - 58;
            System.out.println(nome + " IMC = " + String.format("%.2f", IMC) + "kg");
        }
    }
}
