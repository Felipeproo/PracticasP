public class Tiempo1 {
    private int hora; // Atributo privado hora
    private int minuto; // Atributo privado minuto
    private int segundo; // Atributo privado segundo

    // Método para establecer el tiempo
    public void establecerTiempo(int hora, int minuto, int segundo) {
        // Validación de los valores de hora, minuto y segundo
        if (hora < 0 || hora > 24 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("Hora, minuto y segundo estaban fuera de rango"); 
        }
        this.hora = hora; // Asigna el valor de hora al miembro de la clase
        this.minuto = minuto; // Asigna el valor de minuto al miembro de la clase
        this.segundo = segundo; // Asigna el valor de segundo al miembro de la clase
    }

    // Método que devuelve una representación en formato de 24 horas
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    // Método que devuelve una representación en formato de 12 horas
    public String toString() {
        return String.format("%d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}

