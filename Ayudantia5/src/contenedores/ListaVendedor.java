package contenedores;

import ucn.StdOut;

/**
 * Clase contenedor de la clase objects.Vendedor.
 */
public class ListaVendedor {
    /**
     * Lista de vendedores.
     */
    private final Vendedor[] vendedores;
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
    public ListaVendedor(int cantidadMaxima) {
        this.vendedores = new Vendedor[cantidadMaxima];
        this.cantidadActual = 0;
        this.cantidadMaxima = cantidadMaxima;
    }

    /**
     * Comprueba si existe el vendedor en el contenedor a través de su nombre.
     * @param nombre Nombre del vendedor.
     * @return True si existe, False en caso contrario.
     */
    public boolean existe(String nombre) {
        return this.buscar(nombre)!=null;
    }

    /**
     * Agrega un vendedor al contenedor.
     * @param vendedor objects.Vendedor a agregar.
     */
    public void agregar(Vendedor vendedor) {
        //revisa si la lista ya esta llena.
        if(this.cantidadActual>=this.cantidadMaxima){
            StdOut.println("La lista esta llena.");
            return;
        }

        /**
         * Revisa si el vendedor ya existe en la lista.
         * - Usado cuando los elementos son unicos. -
         */
        if(this.existe(vendedor.getNombre())){
            StdOut.println("El vendedor ya esta en la lista.");
            return;
        }

        //agrega al vendedor.
        this.vendedores[this.cantidadActual]=vendedor;
        this.cantidadActual++;
    }

    /**
     * Busca un vendedor en el contenedor a través de su nombre.
     * @param nombre Nombre del vendedor.
     * @return objects.Vendedor si es que existe, null en caso contrario.
     */
    public Vendedor buscar(String nombre) {
        for(int i=0;i<this.cantidadActual;i++){
            Vendedor vendedor = this.vendedores[i];
            //revisa si el nombre del vendedor en la lista es o no es el buscado.
            if(vendedor.getNombre().equals(nombre)){
                return vendedor;
            }
        }
        //recorrio la lista y no encontro el vendedor buscado.
        return null;
    }

    /**
     * Obtiene un vendedor a través de su posición en el contenedor.
     * @param posicion Posición a evaluar.
     * @return objects.Vendedor si la posición es válida, en caso contrario retorna null.
     */
    public Vendedor obtener(int posicion) {return this.vendedores[posicion];}

    /**
     * Get de la cantidad actual.
     * @return Cantidad actual del contenedor.
     */
    public int getCantidadActual() {
        return cantidadActual;
    }
}
