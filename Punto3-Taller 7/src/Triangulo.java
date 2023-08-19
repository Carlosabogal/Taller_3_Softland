public class Triangulo implements FiguraGeometrica {

    private double base;
    private double altura;


    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public String calcularArea() {
        return "El area del triangulo es : "+ (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {

        return ladoA + ladoB + ladoC;

    }

}
