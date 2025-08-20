// Uso de constructores sobrecargados para inicializar objetos Tiempo2
public class PruebaTiempo2 {
    public static void main(String[] args) {
        // Crea un objeto Tiempo2 usando el constructor sin parámetros (00:00:00)
        Tiempo2 t1 = new Tiempo2(); // 00:00:00
        
        // Crea un objeto Tiempo2 usando un constructor con solo la hora (02:00:00)
        Tiempo2 t2 = new Tiempo2(2); // 02:00:00
        
        // Crea un objeto Tiempo2 usando un constructor con hora y minuto (21:34:00)
        Tiempo2 t3 = new Tiempo2(21, 34); // 21:34:00
        
        // Crea un objeto Tiempo2 usando un constructor con hora, minuto y segundo (12:25:42)
        Tiempo2 t4 = new Tiempo2(12, 25, 42); // 12:25:42
        
        // Crea un objeto Tiempo2 usando el constructor de copia (copia de t4: 12:25:42)
        Tiempo2 t5 = new Tiempo2(t4); // 12:25:42

        // Imprime encabezado para mostrar los tiempos construidos
        System.out.println("Se construyó con:");
        
        // Llama al método mostrarTiempo para cada objeto, con una descripción diferente
        mostrarTiempo("t1: todos los argumentos predeterminados", t1);
        mostrarTiempo("t2: se especificó hora; minuto y segundo predeterminados", t2);
        mostrarTiempo("t3: se especificaron hora y minuto; segundo predeterminado", t3);
        mostrarTiempo("t4: se especificaron hora, minuto y segundo", t4);
        mostrarTiempo("t5: se especificó el objeto Tiempo2 llamado t4", t5);

        // Intento de inicializar t6 con valores inválidos usando un bloque try-catch
        try {
            // Intenta crear un objeto con valores inválidos (27 horas, 74 minutos, 99 segundos)
            Tiempo2 t6 = new Tiempo2(27, 74, 99); // valores inválidos
        } catch (IllegalArgumentException e) {
            // Captura la excepción y muestra un mensaje de error
            System.out.printf("%nExcepción al inicializar t6: %s%n", e.getMessage());
        }
    }

    // Método auxiliar que muestra un objeto Tiempo2 en formatos de 24 y 12 horas
    private static void mostrarTiempo(String encabezado, Tiempo2 t) {
        // Imprime el encabezado, luego el tiempo en formato universal (24h) y formato estándar (12h)
        System.out.printf("%s%n %s%n %s%n", encabezado, t.aStringUniversal(), t.toString());
    }
}