import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Electrónica", "Ropa"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione la categoría:", "Categoría",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        CategoriaProducto categoria;

        if (seleccion == 0) {
            categoria = new CategoriaElectronica();
        } else {
            categoria = new CategoriaRopa();
        }

        categoria.mostrarCategoria();

        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        double precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));

        Productos producto;

        if (seleccion == 0) {
            producto = new ProductoElectronica(nombreProducto, precioProducto);
        } else {
            String tallaProducto = JOptionPane.showInputDialog("Ingrese la talla del producto:");
            producto = new ProductoRopa(nombreProducto, tallaProducto, precioProducto);
        }

        producto.mostrarDetalles();



    }
}