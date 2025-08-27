import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println(" SISTEMA DE REGISTRO ESTUDIANTIL");
        
        // Solicitar datos del estudiante
        System.out.println(" REGISTRO DE NUEVO ESTUDIANTE");
        
        System.out.print(" Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print(" Apellido Paterno: ");
        String apellidoPaterno = scanner.nextLine();
        
        System.out.print(" Apellido Materno: ");
        String apellidoMaterno = scanner.nextLine();
        
        System.out.print(" Fecha de Nacimiento (dia/Mes/año): ");
        String fechaStr = scanner.nextLine();
        Date fechaNacimiento = parseFecha(fechaStr);
        
        System.out.print(" ID del estudiante: ");
        String id = scanner.nextLine();
        
        System.out.print(" Carrera: ");
        String carrera = scanner.nextLine();
        
        System.out.print(" Título (Licenciatura, Master, Ph.D): ");
        String titulo = scanner.nextLine();
        
        System.out.print(" Año de Graduación: ");
        int anioGraduacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        // Crear objeto Estudiante
        Estudiante estudiante = new Estudiante(nombre, apellidoPaterno, apellidoMaterno, 
                                              fechaNacimiento, id, carrera, titulo, anioGraduacion);
        
        // Mostrar datos del estudiante
        System.out.println("\n ESTUDIANTE REGISTRADO EXITOSAMENTE");
        System.out.println("=====================================");
        System.out.println("Nombre: " + estudiante.obtenerNombreComplete());
        System.out.println("ID: " + estudiante.obtenerId());
        System.out.println("Carrera: " + estudiante.obtenerCarrera());
        
        // Solicitar calificaciones
        System.out.println("\n REGISTRO DE CALIFICACIONES ");
        System.out.print(" Número de calificaciones a registrar: ");
        int numeroCalificaciones = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        if (numeroCalificaciones > 0) {
            String[] calificaciones = new String[numeroCalificaciones];
            
            System.out.println("Ingrese las calificaciones (A, A-, B+, B, B-, C+, C, D, F):");
            for (int i = 0; i < numeroCalificaciones; i++) {
                System.out.print("Calificación " + (i + 1) + ": ");
                calificaciones[i] = scanner.nextLine().toUpperCase();
            }
            
            // Calcular promedio
            estudiante.calcularPromedio(calificaciones);
            
            // Mostrar promedio
            System.out.println("\n Promedio calculado: " + 
                              String.format("%.2f", estudiante.obtenerPromedio()));
        } else {
            System.out.println(" No se registraron calificaciones.");
        }
        
        // Preguntar por cambio de carrera
        System.out.println("\n OPCIONES ADICIONALES");
        System.out.print("¿Desea cambiar la carrera del estudiante? (si/no): ");
        String respuesta = scanner.nextLine();
        
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Nueva carrera: ");
            String nuevaCarrera = scanner.nextLine();
            estudiante.cambiarCarrera(nuevaCarrera);
        }
        
        // Mostrar datos finales
        System.out.println("\n" + estudiante.toString());
        
    
        System.out.println("     PROGRAMA FINALIZADO         ");
       
        
        scanner.close();
    }
    
    // Método auxiliar para parsear fecha
    private static Date parseFecha(String fechaStr) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dia/Mes/año");
            sdf.setLenient(false); // Validación estricta de fechas
            return sdf.parse(fechaStr);
        } catch (Exception e) {
            System.out.println("  Formato de fecha inválido. Usando fecha actual.");
            return new Date();
        }
    }
}