public class Computadoras extends DispositivosElectronicos{

    private String conectividad;
    private String audio;

    public Computadoras(String almacenamiento, String marca, String conectividad, String audio){

        super(almacenamiento, marca);

            this.conectividad = conectividad;
            this.audio= audio;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    @Override
    public String DuracionCarga(){
        return getAudio();
    }

}