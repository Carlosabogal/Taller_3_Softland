public class CategoriaRopa extends CategoriaProducto {
    public CategoriaRopa() {
        super("Ropa");
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("Categoría: " + nombreCategoria);
    }
}