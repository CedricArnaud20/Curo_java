package aula10;

public class Professor extends Pessoa{
   private String especialiade;
   private double salario;
   
   public void ReceberAum(float Aum){
       this.salario += Aum;
       
   }

    public String getEspecialiade() {
        return especialiade;
    }

    public void setEspecialiade(String especialiade) {
        this.especialiade = especialiade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
   
   
}
