package listaRecursividade;

//12
public class SomaArray {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(somaArray(numeros, numeros.length));
    }

    public static int somaArray(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return arr[n - 1] + somaArray(arr, n - 1);
        }
    }
}
