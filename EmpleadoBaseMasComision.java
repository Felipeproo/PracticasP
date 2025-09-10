// Clase que representa a un empleado con salario base más comisión por ventas
public class EmpleadoBaseMasComision extends Empleado {
    private double ventasBrutas;     // Total de ventas realizadas
    private double tarifaComision;   // Porcentaje de comisión sobre ventas
    private double salarioBase;      // Salario fijo semanal

    // Constructor con validación de datos
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                                   double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        // Comentario: Validamos que los valores sean positivos
        if (ventasBrutas < 0.0 || tarifaComision <= 0.0 || salarioBase < 0.0) {
            throw new IllegalArgumentException("Valores inválidos");
        }

        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.salarioBase = salarioBase;
    }

    // Métodos de acceso
    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    public double obtenerTarifaComision() {
        return tarifaComision;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    // Implementación del método de la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
        // Comentario: Se suma el salario base más la comisión por ventas
        return salarioBase + (ventasBrutas * tarifaComision);
    }

    // Representación en texto del objeto
    @Override
    public String toString() {
        return String.format("%s%nVentas brutas: $%,.2f%nTarifa comisión: %.2f%nSalario base: $%,.2f",
                super.toString(), ventasBrutas, tarifaComision, salarioBase);
    }
}