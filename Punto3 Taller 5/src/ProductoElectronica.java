public class ProductoElectronica implements Productos {
    private String nombre;
    private double precio;

    public ProductoElectronica(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
    }
}