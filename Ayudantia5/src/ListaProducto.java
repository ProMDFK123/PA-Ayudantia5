/**
 * Clase contenedor de la clase Producto.
 */
public class ListaProducto {
    /**
     * Lista de productos.
     */
    private final Producto[] productos;
    /**
     * Cantidad actual del contenedor.
     */
    private int cantidadActual;
    /**
     * Cantidad máxima del contenedor.
     */
    private final int cantidadMaxima;

    /**
     * Constructor de la clase.
     * @param cantidadMaxima Cantidad máxima del contenedor.
     */
    public ListaProducto(int cantidadMaxima) {
        this.productos = new Producto[cantidadMaxima];
        this.cantidadActual = 0;
        this.cantidadMaxima = cantidadMaxima;
    }

    /**
     * Comprueba si existe el producto dentro del contenedor a través de su código.
     * @param codigo Código único del producto.
     * @return True si existe el producto, False en caso contrario.
     */

    public boolean existe(int codigo) {
        // TODO
    }

    /**
     * Agrega un producto al contenedor.
     * @param producto Producto a agregar.
     */
    public void agregar(Producto producto) {
        // TODO
    }

    /**
     * Busca un producto en el contenedor a través de su código.
     * @param codigo Código único del producto.
     * @return Producto si es que existe, null en caso contrario.
     */
    public Producto buscar(int codigo) {
        // TODO
    }
}
