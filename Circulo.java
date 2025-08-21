public class Circulo extends Figura {
    private double pi=3.1416;
    private double radio;

    public Circulo(double radio,double perimetro,double area){
        super(area, perimetro);
        this.radio=radio;
    }
    @Override
    public double Area(){
        double suma=1;
        double area;
        for(int i=0;i<2;i++){
         suma*=radio;
        }
        area=pi*suma;
        return area;
    }
@Override
    public double Perimetro(){
        double perimetro=2*pi*radio;
        return perimetro;
    }


}
