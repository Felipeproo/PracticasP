public class Figura {
    private double area;
    private double perimetro;

    public Figura(double area, double perimetro){
        this.area=area;
        this.perimetro=perimetro;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
   
    public double Perimetro(){
       return perimetro;
    }
   
    public double Area(){
       return area;
    }
}
