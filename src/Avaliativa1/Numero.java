package Avaliativa1;

public class Numero {

    private Integer numero;

    public Numero(Integer numero) {

        this.numero = numero;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.valueOf(this.numero);
    }

}
