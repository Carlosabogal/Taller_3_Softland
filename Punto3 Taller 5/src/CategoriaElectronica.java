public class CategoriaElectronica extends CategoriaProducto {
    public CategoriaElectronica() {
        super("Electrónica");
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("Categoría: " + nombreCategoria);
    }
}