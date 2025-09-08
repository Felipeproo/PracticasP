public class Laptops extends Computadoras{
    
    String pantalla;

    public Laptops(String almacenamiento, String marca, String conectividad, String audio,String pantalla ){

        super(almacenamiento, marca, conectividad, audio);

            this.pantalla = pantalla;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public String DuracionCarga(){
        return getPantalla();
    }
}