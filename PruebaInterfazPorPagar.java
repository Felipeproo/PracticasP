public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[6];

        // Comentario: Se agregan dos objetos Factura como se solicita
        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);

        // Comentario: Se agregan un objeto de cada subclase de Empleado
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 40, 15.50);
        objetosPorPagar[4] = new EmpleadoBaseMasComision("Sue", "Jones", "333-33-3333", 10000, 0.06, 300);
        objetosPorPagar[5] = new EmpleadoPorComision("Bob", "Lewis", "444-44-4444", 5000, 0.04, 1000);

        System.out.println("Facturas y Empleados procesados en forma polimórfica:");

        for (PorPagar porPagarActual : objetosPorPagar) {
            System.out.printf("%n%s%nPago vencido: $%,.2f%n",
                    porPagarActual.toString(), porPagarActual.obtenerMontoPago());
        }
    }
}
