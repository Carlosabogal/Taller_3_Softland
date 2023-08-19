public class Main {
    public static void main(String[] args) {
        InstrumentosMusicales[] instrumentosMusicales = new InstrumentosMusicales[3];
        instrumentosMusicales[0] = new Guitarra();
        instrumentosMusicales[1] = new Piano();
        instrumentosMusicales[2] = new violin();

        for (InstrumentosMusicales instrumentosMusicales1 : instrumentosMusicales) {
           System.out.println("Esta sonando el " + instrumentosMusicales1.tocar());
        }
    }
}