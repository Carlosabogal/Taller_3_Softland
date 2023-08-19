public class Main {
    public static void main(String[] args) {

        FiguraGeometrica[] formas = new FiguraGeometrica[3];
        formas[0] = new Circulo(5);
        formas[1] = new Cuadrado(4);
        formas[2] = new Triangulo(4, 4, 2, 2, 2);

        for (FiguraGeometrica forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }

    }
    }
