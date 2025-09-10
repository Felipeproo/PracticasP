// Clase que representa a un empleado que cobra por horas trabajadas
public class EmpleadoPorHoras extends Empleado {
    private double horas;           // Total de horas trabajadas en la semana
    private double sueldoPorHora;   // Pago por cada hora trabajada

    // Constructor con validación de datos
    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                            double horas, double sueldoPorHora) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        // Comentario: Validamos que las horas y el sueldo por hora sean valores positivos
        if (horas < 0.0 || sueldoPorHora < 0.0) {
            throw new IllegalArgumentException("Horas y sueldo deben ser >= 0.0");
        }

        this.horas = horas;
        this.sueldoPorHora = sueldoPorHora;
    }

    // Métodos de acceso
    public double obtenerHoras() {
        return horas;
    }

    public double obtenerSueldoPorHora() {
        return sueldoPorHora;
    }

    // Implementación del método de la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
        // Comentario: Si trabajó más de 40 horas, se paga tiempo extra (1.5x)
        if (horas <= 40) {
            return horas * sueldoPorHora;
        } else {
            return 40 * sueldoPorHora + (horas - 40) * sueldoPorHora * 1.5;
        }
    }

    // Representación en texto del objeto
    @Override
    public String toString() {
        return String.format("%s%nHoras trabajadas: %.2f%nSueldo por hora: $%.2f",
                super.toString(), horas, sueldoPorHora);
    }
}