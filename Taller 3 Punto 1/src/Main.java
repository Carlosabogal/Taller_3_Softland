public class Main {
    public static void main(String[] args) {

        FiguraGeometrica circulo = new Circulo(5.0);
        FiguraGeometrica triangulo = new Triangulo(3.0, 4.0 ,2,2,3);
        FiguraGeometrica cuadrado = new Cuadrado(6.0);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
    }
    }
