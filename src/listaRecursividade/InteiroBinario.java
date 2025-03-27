package listaRecursividade;

public class InteiroBinario {
    public static void main(String[] args) {
        System.out.println(calcBinario(232));
    }

    public static String calcBinario(int valor) {
        if (valor == 0) {
            return "0";
        } else if (valor == 1) {
            return "1";
        } else {
            return calcBinario(valor / 2) + (valor % 2);
        }
    }
}
