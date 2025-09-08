public class Telefonos extends DispositivosElectronicos{
    
    private String pantalla;
    private String conectividad;

    public Telefonos(String almacenamiento, String marca, String pantalla, String conectividad){
        super(almacenamiento, marca);

            this.pantalla = pantalla;
            this.conectividad = conectividad;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }


    @Override
    public String DuracionCarga(){
        return getPantalla();
    }


}