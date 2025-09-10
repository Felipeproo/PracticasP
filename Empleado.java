public abstract class Empleado implements PorPagar {
    private String primerNombre;
    private String apellidoPaterno;
    private String  numeroSeguroSocial;
    
    public Empleado(String primerNombre,String apellidoPaterno,String numeroSeguroSocial){
        this.apellidoPaterno=apellidoPaterno;
        this.numeroSeguroSocial=numeroSeguroSocial;
        this.primerNombre=primerNombre;

    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s","nombre del empleado",primerNombre,apellidoPaterno,
        "numero seguro social del empleado",numeroSeguroSocial );
    }
   
    }

