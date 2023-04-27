/**
 * Clase producto.
 */
public class Producto {
    /**
     * Código único del producto.
     */
    private int codigo;
    /**
     * Nombre del producto.
     */
    private String nombre;
    /**
     * Cantidad de unidades disponibles del producto.
     */
    private int cantidadUnidades;

    /**
     * Constructor de la clase.
     * @param codigo Código único del producto.
     * @param nombre Nombre del producto.
     * @param cantidadUnidades Cantidad de unidades disponibles del producto.
     */
    public Producto(int codigo, String nombre, int cantidadUnidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadUnidades = cantidadUnidades;
    }

    /**
     * Get del código del producto.
     * @return Código del producto.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Get de la cantidad de unidades disponibles.
     * @return Cantidad de unidades disponibles.
     */
    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    /**
     * Set de la cantidad de unidades disponibles.
     * @param cantidadUnidades Nueva cantidad de unidades disponibles.
     */
    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }
}
