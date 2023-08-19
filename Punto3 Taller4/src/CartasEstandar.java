public class CartasEstandar implements Cartas {
        private String palo;
        String valor;

        public CartasEstandar(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
        }

        @Override
        public void mostrarCarta() {
        System.out.println(valor + " de " + palo);
        }

        @Override
        public int valorNumerico() {

        return 0;
        }
}