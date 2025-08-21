public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(double lado,double perimetro,double area){
        super(area, perimetro);
        this.lado=lado;
    }
    @Override
    public double Perimetro(){
     double  perimetro= 4*lado;
      return perimetro;

    }
@Override
    public double Area(){
        double area=1;
        for(int i =0;i<2;i++){
            area*=lado;
        }
        return area;
    }
}
