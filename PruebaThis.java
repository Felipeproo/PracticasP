public class PruebaThis {
    public static void main(String[] args) {
        // Crea un objeto TiempoSimple con hora, minuto y segundo
        TiempoSimple tiempo = new TiempoSimple(15, 30, 19);
        // Imprime el resultado del método crearString() del objeto tiempo
        System.err.println(tiempo.crearString());
    }
}

// La clase TiempoSimple declara la referencia 'this'
class TiempoSimple {
    private int hora; // Atributo privado hora
    private int minuto; // Atributo privado minuto
    private int segundo; // Atributo privado segundo

    // Constructor que inicializa los atributos
    public TiempoSimple(int hora, int minuto, int segundo) {
        this.hora = hora; // Asigna el valor de hora al miembro de la clase
        this.minuto = minuto; // Asigna el valor de minuto al miembro de la clase
        this.segundo = segundo; // Asigna el valor de segundo al miembro de la clase
    }

    // Método que devuelve una cadena con el formato de tiempo
    public String crearString() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    // Método que devuelve una cadena en un formato universal
    public String aStringUniversal() {
        return String.format("%04d-%02d-%02d", this.hora, this.minuto, this.segundo);
    }
}

