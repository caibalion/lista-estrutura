import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        String nome;
        double altura;
        int sexo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.print("Digite seu sexo: \n1 - Masculino\n2 - Feminino \n");
        sexo = sc.nextInt();
        calcIMC(altura, sexo);
    }

    public static void calcIMC(double altura, int sexo) {
        double IMC;
        if (sexo == 2) {
            IMC = (62.1 * altura) - 44.7;
            System.out.println("IMC = " + IMC);
        } else {
            IMC = (72.7 * altura) - 58;
            System.out.printf("%.2f","IMC = " + IMC);
        }
    }
}
