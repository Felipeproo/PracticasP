import java.util.Date;
import java.text.SimpleDateFormat;

public class Estudiante extends Persona {
    private String id;
    private double promedio;
    private String carrera;
    private String titulo;
    private int anioGraduacion;

    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, 
                     Date fechaNacimiento, String id, String carrera, String titulo, int anioGraduacion) {
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
        this.id = id;
        this.carrera = carrera;
        this.titulo = titulo;
        this.anioGraduacion = anioGraduacion;
        this.promedio = 0.0;
    }

    // Métodos accesores
    public String obtenerId() {
        return id;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public String obtenerCarrera() {
        return carrera;
    }

    public String obtenerTitulo() {
        return titulo;
    }

    public int obtenerAnioGraduacion() {
        return anioGraduacion;
    }

    // Método para cambiar carrera
    public void cambiarCarrera(String nuevaCarrera) {
        this.carrera = nuevaCarrera;
        System.out.println("Carrera cambiada exitosamente a: " + nuevaCarrera);
    }

    // Método para calcular promedio
    public void calcularPromedio(String[] calificaciones) {
        double sumaPuntos = 0.0;
        
        for (String calificacion : calificaciones) {
            sumaPuntos += convertirCalificacionAPuntos(calificacion);
        }
        
        this.promedio = sumaPuntos / calificaciones.length;
    }

    // Método auxiliar para convertir calificaciones a puntos
    public double convertirCalificacionAPuntos(String calificacion) {
        switch (calificacion.toUpperCase()) {
            case "A": return 4.0;
            case "A-": return 3.67;
            case "B+": return 3.33;
            case "B": return 3.0;
            case "B-": return 2.67;
            case "C+": return 2.33;
            case "C": return 2.0;
            case "D": return 1.0;
            case "F": return 0.0;
            default: 
                System.out.println("Calificación '" + calificacion + "' no reconocida. Se usará 0.0");
                return 0.0;
        }
    }

    // Sobrescribir método toString
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "=== DATOS DEL ESTUDIANTE ===\n" +
               "Nombre: " + obtenerNombreComplete() + "\n" +
               "Fecha de Nacimiento: " + sdf.format(obtenerFechaNacimiento()) + "\n" +
               "ID: " + id + "\n" +
               "Promedio: " + String.format("%.2f", promedio) + "\n" +
               "Carrera: " + carrera + "\n" +
               "Título: " + titulo + "\n" +
               "Año de Graduación: " + anioGraduacion;
    }
}