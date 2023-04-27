import ucn.StdIn;
import ucn.StdOut;

/**
 * Clase Main.
 */
public class Main {
    /**
     * Método main.
     */
    public static void main(String[] args) {
        Sistema sistema = new SistemaImpl();
        menuInicial(sistema);
    }

    /**
     * Despliega el menú inicial del sistema.
     * @param sistema Sistema a gestionar.
     */
    public static void menuInicial(Sistema sistema) {
        while (true) {
            print("""
                <><><><> Menú inicial <><><><>
                [1] Iniciar sesión.
                [2] Salir.""");

            int numero;


            while (true) {
                String respuesta = input("Ingrese una opción: ");

                try {
                    numero = Integer.parseInt(respuesta);

                    if (1 <= numero && numero <= 2) {
                        break;
                    }
                } catch (Exception ignored) {  }
            }

            switch (numero) {
                case 1 -> {
                    menuIniciarSesion(sistema);
                    menuPrincipal(sistema);
                }
                case 2 -> {
                    return;
                }
            }
        }
    }

    /**
     * Despliega el menú para iniciar sesión en el sistema.
     * @param sistema Sistema a gestionar.
     */
    public static void menuIniciarSesion(Sistema sistema) {
        print("""
            <><><><> Menú iniciar sesión <><><><>""");

        String nombre;
        String contrasenia;

        while (true) {
            nombre = input("Ingrese el nombre: ");
            contrasenia = input("Ingrese la contraseña: ");

            sistema.iniciarSesion(nombre, contrasenia);

            if (sistema.existeVendedorIngresado()) {
                print("Inicio de sesión exitoso.");
                break;
            } else {
                print("Error, vuelva a intentar.");
            }
        }
    }

    /**
     * Despliega el menú principal del sistema.
     * @param sistema Sistema a gestionar.
     */
    public static void menuPrincipal(Sistema sistema) {
        while (true) {
            print("""
                <><><><> Menú principal <><><><>
                [1] Realizar venta
                [2] Ver vendedores
                [3] Cerrar sesión""");

            int numero;

            while (true) {
                String respuesta = input("Ingrese una opción: ");

                try {
                    numero = Integer.parseInt(respuesta);

                    if (1 <= numero && numero <= 3) {
                        break;
                    }
                } catch (Exception ignored) {  }
            }

            switch (numero) {
                case 1 -> menuRealizarVenta(sistema);
                case 2 -> menuVerVendedores(sistema);
                case 3 -> {
                    menuCerrarSesion(sistema);
                    return;
                }
            }
        }
    }

    /**
     * Despliega el menú para realizar una venta en el sistema.
     * @param sistema Sistema a gestionar.
     */
    public static void menuRealizarVenta(Sistema sistema) {
        print("""
            <><><><> Menú realizar venta <><><><>""");

        int codigo;
        int cantidadVendida;

        while (true) {
            try {
                codigo = Integer.parseInt(input("Ingrese el código: "));
                cantidadVendida = Integer.parseInt(input("Ingrese la cantidad a vender: "));

                if (0 < cantidadVendida) {
                    break;
                }
            } catch (Exception ignored) { }
        }

        if (sistema.realizarVenta(codigo, cantidadVendida)) {
            print("Venta realizada de forma exitosa.");
        } else {
            print("Error en la venta.");
        }
    }

    /**
     * Despliega el menú para ver los vendedores del sistema.
     * @param sistema Sistema a gestionar.
     */
    public static void menuVerVendedores(Sistema sistema) {
        print("""
            <><><><> Menú ver vendedores <><><><>""");

        String[] listado = sistema.obtenerVendedores();

        for (int i = 0; i < listado.length; i++) {
            print("Vendedor N°" + (i + 1));
            print(listado[i]);
        }
    }

    /**
     * Despliega el menú para cerrar sesión en el sistema.
     * @param sistema Sistema a gestionar.
     */
    public static void menuCerrarSesion(Sistema sistema) {
        print("""
            <><><><> Cerrando sesión... <><><><>""");

        sistema.cerrarSesion();
    }

    /**
     * Despliega un mensaje por consola, recibe la entrada por teclado y la devuelve.
     * @param mensaje Mensaje a desplegar por consola.
     * @return Entrada por teclado ingresada.
     */
    public static String input(String mensaje) {
        StdOut.print(mensaje);
        return StdIn.readLine();
    }

    /**
     * Despliega un mensaje.
     * @param mensaje Mensaje a desplegar.
     */
    public static void print(String mensaje) {
        StdOut.println(mensaje);
    }
}