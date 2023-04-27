import ucn.ArchivoEntrada;
import ucn.Registro;

/**
 * Clase SistemaImpl.
 */
public class SistemaImpl implements Sistema {
    /**
     * Vendedor que ha iniciado sesión en el sistema.
     */
    private Vendedor vendedorIngresado;

    /**
     * Lista de vendedores del sistema.
     */
    private final ListaVendedor vendedores;
    /**
     * Lista de productos del sistema.
     */
    private final ListaProducto productos;

    /**
     * Constructor de la clase.
     */
    public SistemaImpl() {
        this.vendedorIngresado = null;
        this.vendedores = new ListaVendedor(100);
        this.productos = new ListaProducto(1000);
        this.procesarArchivoVendedores();
        this.procesarArchivoProductos();
    }

    /**
     * Inicio de sesión de un vendedor al sistema.
     *
     * @param nombre      Nombre del vendedor.
     * @param contrasenia Contrasenia del vendedor.
     */
    @Override
    public void iniciarSesion(String nombre, String contrasenia) {
        // TODO
    }

    /**
     * Cierre de sesión del vendedor ingresado en el sistema.
     */
    @Override
    public void cerrarSesion() {
        // TODO
    }

    /**
     * Comprueba si existe un vendedor ingresado en el sistema.
     *
     * @return True en el caso que si existe, False en caso contrario.
     */
    @Override
    public boolean existeVendedorIngresado() {
        // TODO
    }

    /**
     * Obtiene todos los vendedores presentes en el sistema.
     *
     * @return Arreglo con la información de cada vendedor.
     */
    @Override
    public String[] obtenerVendedores() {
        // TODO
    }

    /**
     * Realiza la venta de un producto a través del vendedor ingresado en el sistema.
     *
     * @param codigo          Código del producto a vender.
     * @param cantidadVendida Cantidad a vender.
     * @return True si la venta fue exitosa, False en caso contrario.
     */
    @Override
    public boolean realizarVenta(int codigo, int cantidadVendida) {
        // TODO
    }

    /**
     * Procesa el archivo vendedores.txt y carga su información en el sistema.
     */
    private void procesarArchivoVendedores() {
        ArchivoEntrada archivo;

        try {
            archivo = new ArchivoEntrada("vendedores.txt");
        } catch (Exception ignored) {
            return;
        }

        while (!archivo.isEndFile()) {
            Registro linea;

            String nombre;
            String contrasenia;
            int edad;

            try {
                linea = archivo.getRegistro();
                nombre = linea.getString();
                contrasenia = linea.getString();
                edad = linea.getInt();
            } catch (Exception ignored) {
                continue;
            }

            Vendedor vendedor = new Vendedor(nombre, contrasenia, edad);

            this.vendedores.agregar(vendedor);
        }

        archivo.close();
    }

    /**
     * Procesa el archivo productos.txt y carga su información en el sistema.
     */
    private void procesarArchivoProductos() {
        ArchivoEntrada archivo;

        try {
            archivo = new ArchivoEntrada("productos.txt");
        } catch (Exception ignored) {
            return;
        }

        while (!archivo.isEndFile()) {
            Registro linea;

            int codigo;
            String nombre;
            int cantidadUnidades;

            try {
                linea = archivo.getRegistro();
                codigo = linea.getInt();
                nombre = linea.getString();
                cantidadUnidades = linea.getInt();
            } catch (Exception ignored) {
                continue;
            }

            Producto producto = new Producto(codigo, nombre, cantidadUnidades);

            this.productos.agregar(producto);
        }

        archivo.close();
    }
}
