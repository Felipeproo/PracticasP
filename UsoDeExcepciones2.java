public class UsoDeExcepciones2 {
    public static void main(String args[]) {
        try {
            lanzaExcepcion(); // Llama al método que lanza excepción
        } catch (Exception excepcion) {
            System.err.println("La excepción se manejó en main");
        }
    }

    public static void lanzaExcepcion() throws Exception {
        try {
            System.out.println("Método lanzaExcepcion");
            throw new Exception(); // Lanza excepción
        } catch (RuntimeException runtimeException) {
            System.err.println("La excepción se manejó en el método lanzaExcepcion");
        } finally {
            System.err.println("Finally siempre se ejecuta");
        }
    }
}