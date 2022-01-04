package ar.edu.ort.tp1.ortmarket.test;

import ar.edu.ort.tp1.ortmarket.modelo.CasaDeBolsa;


public class Test {
    public static void main(String[] args) {
        CasaDeBolsa casaDeBolsa = new CasaDeBolsa();

        System.out.println("-------------Inicializando Clientes-------------");
        inicializarClientes(casaDeBolsa);
        
        casaDeBolsa.imprimirListaPrecios();

        System.out.println("-------------Procesando Ordenes-------------");
        inicializarOrdenes(casaDeBolsa);
       casaDeBolsa.procesarOrdenesDeClientes();

        casaDeBolsa.imprimirHistorialDelCliente();
    }

    private static void generarOrden(CasaDeBolsa casaDeBolsa, int cantidad, String codigoInstrumento, int idCliente, boolean esVenta) {
        try {
            casaDeBolsa.cargarOrden(cantidad, codigoInstrumento, idCliente, esVenta);
        } catch (RuntimeException  e) {
            System.out.println(e.getMessage());
        }
    }

    private static void inicializarClientes(CasaDeBolsa casaDeBolsa) {
        casaDeBolsa.altaCliente(92654897, "Teresa", "", 30000);
        casaDeBolsa.altaCliente(32654897, "Lucia", "Redondo", 30000);
        casaDeBolsa.altaCliente(31754887, "Maria", "Redondo", 5000);
        casaDeBolsa.altaCliente(28123756, "Jose Luis", "Marquez", 1000000);
        casaDeBolsa.altaCliente(6852741, "Mario", "Perez", 60000);
    }

    private static void inicializarOrdenes(CasaDeBolsa casaDeBolsa) {
        generarOrden(casaDeBolsa, 20, "AL30", 92654897, true);
        generarOrden(casaDeBolsa, 20, "AL30", 32654897, true);
        generarOrden(casaDeBolsa, 20, "GD30", 32654897, true);

        generarOrden(casaDeBolsa, 3, "YPFD", 31754887, false);
        generarOrden(casaDeBolsa, 20, "AL30", 28123756, false);
        generarOrden(casaDeBolsa, 1, "YPFD", 6852741, true);

        generarOrden(casaDeBolsa, 5, "GD30", 31754887, false);
        generarOrden(casaDeBolsa, 3, "BACD", 28123756, false);
        generarOrden(casaDeBolsa, 300, "SE", 6852741, false);
    }

}
