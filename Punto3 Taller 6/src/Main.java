public class Main {
    public static void main(String[] args) {

        SonidoAnimal[] animales = new SonidoAnimal[3];
        animales[0] = new SonidoPerro();
        animales[1] = new SonidoGato();
        animales[2] = new SonidoPajaro();

        for (SonidoAnimal animal : animales) {

            animal.SonidoAnimales();
        }
    }
}