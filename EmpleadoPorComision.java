// Clase EmpleadoPorComision con salario base aumentado en 10%
public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;
    private double salarioBase;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                               double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if (ventasBrutas < 0.0 || tarifaComision <= 0.0 || salarioBase < 0.0) {
            throw new IllegalArgumentException("Valores inválidos");
        }

        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.salarioBase = salarioBase;
    }

    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    public double obtenerTarifaComision() {
        return tarifaComision;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    @Override
    public double obtenerMontoPago() {
        // Comentario: Se incrementa el salario base en un 10% como indica el documento
        return salarioBase * 1.10 + (ventasBrutas * tarifaComision);
    }

    @Override
    public String toString() {
        return String.format("%s%nVentas: $%,.2f%nTarifa: %.2f%nSalario base: $%,.2f",
                super.toString(), ventasBrutas, tarifaComision, salarioBase);
    }
}