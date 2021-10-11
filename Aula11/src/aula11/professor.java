package aula11;
public class professor extends aluno{
    private String especialidade;
    private double salario;

    public void receberSalario(float sal){
        this.salario += sal; 
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
