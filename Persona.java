import java.util.Date;

public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    protected Date fechaNacimiento;  // Cambiado a protected

    public Persona(String nombre, String apellidoPaterno,
                  String apellidoMaterno, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public String obtenerApellidoMaterno() {
        return apellidoMaterno;
    }

    public String obtenerNombreComplete() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }

    // Método agregado para acceder a la fecha de nacimiento
    public Date obtenerFechaNacimiento() {
        return fechaNacimiento;
    }
}