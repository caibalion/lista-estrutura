package listaRecursividade;

public class MaiorElementoArray {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 2, 9, 5};
        System.out.println(maiorElemento(numeros, numeros.length)); // 9
    }
    public static int maiorElemento(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int maiorDoResto = maiorElemento(arr, n - 1);

        if (arr[n - 1] > maiorDoResto) {
            return arr[n - 1];
        } else {
            return maiorDoResto;
        }
    }

}

