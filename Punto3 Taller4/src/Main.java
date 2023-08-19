import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Carta Estándar", "Carta Poker"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de carta:", "Tipo de Carta",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        BarajaDeCartas baraja = new BarajaDeCartas();
        baraja.mezclar();

        JOptionPane.showMessageDialog(null, "Repartiendo cartas:");

        for (int i = 0; i < 5; i++) {
            Cartas carta;

            if (seleccion == 0) {
                carta = baraja.repartirCarta();
            } else {
                carta = new RepartirCartasDePoker("Picas", "A");
            }

            if (carta != null) {
                carta.mostrarCarta();
                int valor = carta.valorNumerico();
                JOptionPane.showMessageDialog(null, "Valor Numérico: " + valor);
            }
        }
    }
}