abstract class CategoriaProducto {
    protected String nombreCategoria;

    public CategoriaProducto(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public abstract void mostrarCategoria();
}
