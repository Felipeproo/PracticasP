public class UsoDeExcepciones {
    public static void main(String args[]) {
        try {
            lanzaExcepcion(); // Llama al método que lanza una excepción
        } catch (Exception excepcion) {
            System.err.println("La excepción se manejó en main");
        }

        noLanzaExcepcion(); // Método que no lanza excepción
    }

    public static void lanzaExcepcion() throws Exception {
        try {
            System.out.println("Método lanzaExcepcion");
            throw new Exception(); // Lanza excepción
        } catch (Exception excepcion) {
            System.err.println("La excepción se manejó en el método lanzaExcepcion");
            throw excepcion; // Se relanza para que main la maneje
        } finally {
            System.err.println("Se ejecutó finally en lanzaExcepcion");
        }
    }

    public static void noLanzaExcepcion() {
        try {
            System.out.println("Método noLanzaExcepcion");
        } catch (Exception excepcion) {
            System.err.println(excepcion);
        } finally {
            System.err.println("Se ejecutó finally en noLanzaExcepcion");
        }
        System.out.println("Fin del método noLanzaExcepcion");
    }
}
