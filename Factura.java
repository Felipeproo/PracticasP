public class Factura implements PorPagar {
    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo){
        if(cantidad<0)
        throw new IllegalArgumentException("la cantidad debe ser >=0");

        if(precioPorArticulo<0.0)
        throw new IllegalArgumentException("el precio por articulo debe ser >=0");

        this.cantidad=cantidad;
        this.descripcionPieza=descripcionPieza;
        this.numeroPieza=numeroPieza;
        this.precioPorArticulo=precioPorArticulo;
    }
    public String obtenerNumeroPieza(){
        return numeroPieza;
    }

    public String obtenerDescripcionPieza(){
        return descripcionPieza;
    }
    public void establecerCantidad(int cantidad){
 if(cantidad<0)
        throw new IllegalArgumentException("la cantidad debe ser >=0");
        this.cantidad=cantidad;
    }
    public int obtenerCantidad(){
        return cantidad;
    }
   public void establecerPrecioPorArticulo(double precioPorArticulo){
if(precioPorArticulo<0.0)
        throw new IllegalArgumentException("el precio por articulo debe ser >=0");
        this.precioPorArticulo=precioPorArticulo;
   }

   public double obtenerPrecioPorArticulo(){
    return precioPorArticulo;
   }
   @Override
   public String toString(){
    return String.format("%s: %n%s: %s  %n%s: %d %n%s: $%,.2f", 
    "factura","numero de pieza",obtenerNumeroPieza(),
    "cantidad",obtenerCantidad()," precio por articulo",obtenerPrecioPorArticulo());
   }
   @Override
   public double obtenerMontoPago(){
    return obtenerCantidad()*obtenerPrecioPorArticulo();
   }


}
