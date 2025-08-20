public class PruebaAccesoMiembros {
    public static void main(String[] args) {
        // Crea un objeto Tiempo
        Tiempo tiempo = new Tiempo();
        // Intento de acceder a los atributos privados, lo que generará errores de compilación
        tiempo.hora = 7; // Error: 'hora' tiene modificador de acceso privado
        tiempo.minuto = 15; // Error: 'minuto' tiene modificador de acceso privado
        tiempo.segundo = 30; // Error: 'segundo' tiene modificador de acceso privado
    }
}

