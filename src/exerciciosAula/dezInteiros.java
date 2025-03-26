package exerciciosAula;

public class dezInteiros {
    public static void main(String[] args) {
        int[] inteiros = new int[10];
        preencheArray(inteiros);
        mostraArray(inteiros);

    }

    public static void preencheArray(int[] array) {
        for (int i = 1; i <= 10; i++) {
            array[i - 1] = i;
        }
    }

    public static void mostraArray(int[] array) {
        for (int j : array) {
            System.out.print(j + ", ");

        }
    }
}
