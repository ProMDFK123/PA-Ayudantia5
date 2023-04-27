/**
 * Interface del sistema.
 */
public interface Sistema {
    /**
     * Inicio de sesión de un vendedor al sistema.
     * @param nombre Nombre del vendedor.
     * @param contrasenia Contrasenia del vendedor.
     */
    void iniciarSesion(String nombre, String contrasenia);

    /**
     * Cierre de sesión del vendedor ingresado en el sistema.
     */
    void cerrarSesion();

    /**
     * Comprueba si existe un vendedor ingresado en el sistema.
     * @return True en el caso que si existe, False en caso contrario.
     */
    boolean existeVendedorIngresado();

    /**
     * Obtiene todos los vendedores presentes en el sistema.
     * @return Arreglo con la información de cada vendedor.
     */
    String[] obtenerVendedores();

    /**
     * Realiza la venta de un producto a través del vendedor ingresado en el sistema.
     * @param codigo Código del producto a vender.
     * @param cantidadVendida Cantidad a vender.
     * @return True si la venta fue exitosa, False en caso contrario.
     */
    boolean realizarVenta(int codigo, int cantidadVendida);
}
