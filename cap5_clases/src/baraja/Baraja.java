package baraja;

import java.util.Random;

public class Baraja {
    private Carta[] cartas;

    public Baraja() {
        String[] valores = {
                "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
        };
        Carta.Figura[] figuras = Carta.Figura.values();
        cartas = new Carta[52];

        int k = 0;
        // inicializar cada espacio del array
        for(int i = 0; i < 13; i++) {
            String valor = valores[i];
            for(int j = 0; j < 4; j++) {
                cartas[k++] = new Carta(valor, figuras[j]);
            }
        }
    }

    public void mezclar() {
        // Objetivo: Recorrer todos las cartas y ubicarlas
        // en posiciones al azar.
        Random random = new Random();
        for (int i = 0; i < cartas.length; i++) {
            // swap
            Carta temp = cartas[i];
            int k = random.nextInt(cartas.length);
            cartas[i] = cartas[k];
            cartas[k] = temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cartas.length; i++) {
            sb.append(String.format("%2d-%s", i, cartas[i]));
        }
        return sb.toString();
    }
}
