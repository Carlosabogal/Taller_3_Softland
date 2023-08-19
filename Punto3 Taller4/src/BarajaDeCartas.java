import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BarajaDeCartas {
    private List<Cartas> cartas;

    public BarajaDeCartas() {
        cartas = new ArrayList<>();
        String[] palos = {"Corazones", "Diamantes", "Picas", "Tréboles"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String palo : palos) {
            for (String valor : valores) {
                Cartas carta = new RepartirCartasDePoker(palo, valor);
                cartas.add(carta);
            }
        }
    }

    public void mezclar() {
        int n = cartas.size();
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Cartas temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }

    public Cartas repartirCarta() {
        if (cartas.isEmpty()) {
           System.out.println("No quedan cartas en la baraja.");
            return null;
        }

        Cartas cartaRepartida = cartas.remove(0);
        return cartaRepartida;
    }
}