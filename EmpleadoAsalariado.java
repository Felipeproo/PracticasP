public class EmpleadoAsalariado extends Empleado{
     private double SalarioSemanal;

   public EmpleadoAsalariado(String primerNombre,String apellidoPaterno,String numeroSeguroSocial,
   double SalarioSemanal){
    super(primerNombre, apellidoPaterno, numeroSeguroSocial);
         if (SalarioSemanal<0.0) {
           throw new  IllegalArgumentException("el salario semanal debe ser >=0.0");
            
         }
    this.SalarioSemanal=SalarioSemanal;

   }
   public void establecerAlarioSemanal(double SalarioSemanal){
    if (SalarioSemanal<0.0) {
           throw new  IllegalArgumentException("el salario semanal debe ser >=0.0");
            
         }
    this.SalarioSemanal=SalarioSemanal;

   }

   public double getSalarioSemanal() {
    return SalarioSemanal;
   }

   @Override
   public  double obtenerMontoPago(){
    return getSalarioSemanal();

   }

   @Override
  public String toString(){
    return String.format("%s%n%s: $%,.2f%n",super.toString(),"salario semanal",getSalarioSemanal());
  }
}
