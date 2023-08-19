public class ProductoRopa implements Productos {
    private String nombre;
    private String talla;
    private double precio;

    public ProductoRopa(String nombre, String talla, double precio) {
        this.nombre = nombre;
        this.talla = talla;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre);
        System.out.println("Talla: " + talla);
        System.out.println("Precio: $" + precio);
    }
}
