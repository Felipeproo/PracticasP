public abstract class DispositivosElectronicos{

    private String marca;
    private String almacenamiento;

    public DispositivosElectronicos(String almacenamiento, String marca){

        this.marca = marca;
        this.almacenamiento=almacenamiento;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setPais(String almacenamiento) {
        this. almacenamiento = almacenamiento;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract String DuracionCarga();
  


}