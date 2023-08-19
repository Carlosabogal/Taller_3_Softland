public class Cuadrado implements FiguraGeometrica {
        private double lado;

        public Cuadrado(double lado) {
                this.lado = lado;
        }

        @Override
        public String calcularArea() {
                return "El area del cuadrado es :"+lado * lado;
        }

        @Override
        public double calcularPerimetro() {
                return 4 * lado;
        }
}