// Declaración de la clase Tiempo2 con constructores sobrecargados.

public class Tiempo2 {
    private int hora;    // 0 - 23
    private int minuto;  // 0 - 59
    private int segundo; // 0 - 59

    // Constructor de Tiempo2 sin argumentos:
    // Inicializa cada variable de instancia a cero
    public Tiempo2() {
        this(0, 0, 0); // Invoca al constructor de Tiempo2 con tres argumentos
    }

    // Constructor de Tiempo2: se suministra hora, minuto y segundo con valor predeterminado de 0
    public Tiempo2(int hora) {
        this(hora, 0, 0); // Invoca al constructor con tres argumentos
    }

    // Constructor de Tiempo2: se suministra hora y minuto, segundo con valor predeterminado de 0
    public Tiempo2(int hora, int minuto) {
        this(hora, minuto, 0); // Invoca al constructor con tres argumentos
    }

    // Constructor de Tiempo2: se suministra hora, minuto y segundo
    public Tiempo2(int hora, int minuto, int segundo) {
        // Valida que la hora esté en el rango correcto (0-23)
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");

        // Valida que el minuto esté en el rango correcto (0-59)
        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        // Valida que el segundo esté en el rango correcto (0-59)
        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        // Si todas las validaciones son correctas, asigna los valores a los atributos
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
}
// Constructor de Tiempo2: se suministra otro objeto Tiempo2
public Tiempo2(Tiempo2 tiempo) {
    // Invoca al constructor con tres argumentos de la misma clase
    // Pasa los valores de hora, minuto y segundo del objeto recibido como parámetro
    this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
}

// Métodos Establecer (Setters)

// Establece un nuevo valor de tiempo usando la hora universal; valida los datos
public void establecerTiempo(int hora, int minuto, int segundo) {
    // Valida que la hora esté en el rango correcto (0-23)
    if (hora < 0 || hora >= 24)
        throw new IllegalArgumentException("hora debe estar entre 0 y 23");
    
    // Valida que el minuto esté en el rango correcto (0-59)
    if (minuto < 0 || minuto >= 60)
        throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
    
    // Valida que el segundo esté en el rango correcto (0-59)
    if (segundo < 0 || segundo >= 60)
        throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
    
    // Si todas las validaciones son correctas, asigna los valores a los atributos
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
}

// Valida y establece la hora
public void establecerHora(int hora) {
    // Valida que la hora esté en el rango correcto (0-23)
    if (hora < 0 || hora >= 24)
        throw new IllegalArgumentException("hora debe estar entre 0 y 23");
    
    // Asigna el valor validado al atributo hora
    this.hora = hora;
}

// Valida y establece el minuto
public void establecerMinuto(int minuto) {
    // NOTA: Hay un error en esta condición, debería ser "||" en lugar de "&&"
    // La condición actual es incorrecta y siempre será falsa
    if (minuto < 0 && minuto >= 60) // ERROR - debería ser: if (minuto < 0 || minuto >= 60)
        throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
    
    // Asigna el valor al atributo minuto (sin validación adecuada debido al error)
    this.minuto = minuto;
}

// Valida y establece el segundo
public void establecerSegundo(int segundo) {
    // NOTA: Hay un error en esta condición, está invertida
    // La condición actual verifica si el segundo es válido, pero luego lanza excepción
    if (segundo >= 0 && segundo < 60) // ERROR - debería ser: if (segundo < 0 || segundo >= 60)
        throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
    
    // Faltaría la asignación: this.segundo = segundo;
}