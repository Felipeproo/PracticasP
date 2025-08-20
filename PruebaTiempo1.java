javacapublic class PruebaTiempo1 {
    public static void main(String[] args) {
        // Crea un objeto Tiempo
        Tiempo tiempo = new Tiempo();
        // Muestra el estado del objeto tiempo
        mostrarTempo("Después de crear el objeto tiempo:", tiempo);
        System.out.println();

        try {
            // Intenta establecer un tiempo inválido
            tiempo.establecerTiempo(99, 99, 99);
        } catch (IllegalArgumentException e) {
            // Imprime el mensaje de excepción si ocurre
            System.out.println("Excepción: " + e.getMessage());
        }
    }

    // Método estático para mostrar el tiempo
    private static void mostrarTempo(String mensaje, Tiempo tiempo) {
        System.out.println(mensaje + " " + tiempo.toString());
    }
}