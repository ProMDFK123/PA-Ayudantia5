/**
 * Clase vendedor.
 */
public class Vendedor {
    /**
     * Nombre del vendedor.
     */
    private final String nombre;
    /**
     * Contraseña del vendedor.
     */
    private final String contrasenia;
    /**
     * Edad del vendedor.
     */
    private final int edad;

    /**
     * Constructor de la clase.
     * @param nombre Nombre del vendedor.
     * @param contrasenia Contraseña del vendedor.
     * @param edad Edad del vendedor.
     */
    public Vendedor(String nombre, String contrasenia, int edad) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.edad = edad;
    }

    /**
     * Método toString() de la clase.
     * @return Toda la información de la clase.
     */
    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "Edad: " + this.edad;
    }

    /**
     * Get del nombre del vendedor.
     * @return Nombre del vendedor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Get de la contraseña del vendedor.
     * @return Contraseña del vendedor.
     */
    public String getContrasenia() {
        return contrasenia;
    }
}
