public class Main {
    public static void main(String[] args) {
        Circulo circle = new Circulo("Rojo", 5.0);
        Rectangulo rectangle = new Rectangulo("Azul", 10.0, 6.0);

        Dibujable[] dibujables = {circle, rectangle};

        Lienzo lienzo = new Lienzo(dibujables);
        lienzo.dibujarTodo();
    }
}