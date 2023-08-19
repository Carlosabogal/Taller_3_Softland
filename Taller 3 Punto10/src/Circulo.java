public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibujo un círculo de color " + getColor() + " con un radio " + radio);
    }
}