public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo de color " + getColor() + ", ancho " + ancho + " y alto " + alto);
    }
}