public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado;
    public Triangulo(double altura, double base,double lado,double perimetro,double area){
    super(area, perimetro);
        this.altura=altura;
        this.base=base;
        this.lado=lado;


    }
@Override
    public double Area(){
        double area= base*altura/2;
        return area;
    }
@Override
    public double Perimetro(){
    double perimetro=0;
    for(int i=0;i<3;i++){
        perimetro+=lado;
    }
    return perimetro;
}
}
