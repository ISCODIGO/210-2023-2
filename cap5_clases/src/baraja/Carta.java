package baraja;

public class Carta {
    public enum Figura {
            CORAZON, TREBOL, PICA, DIAMANTE;
    }

    public Carta(String valor, Figura figura) {
        this.valor = valor;
        this.figura = figura;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    @Override
    public String toString() {
        return String.format("%s de %s%n", valor, figura.toString().toLowerCase());
    }

    private String valor;
    private Figura figura;
}
