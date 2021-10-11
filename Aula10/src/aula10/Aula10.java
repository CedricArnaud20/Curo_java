
package aula10;
public class Aula10 {
    public static void main(String[] args) {
        // PROGRAMA PRINCIPAL
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        
        p1.setNome("Maria");
        p2.setNome("Pedro");
        p3.setNome("Claúdia");
        p4.setNome("Fabiana");
        
        p1.setSexo("F");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");
        
        p1.setIdade(20);
        p2.setIdade(32);
        p3.setIdade(52);
        p4.setIdade(33);
        
        p2.setCurso("Engenharia de Software");
        p3.setSalario(42000);
        p4.setSetor("Estoque");
        
        p3.ReceberAum(2500);
        p4.MudarTrabalho();
        
        System.out.println(p1.toString());
        
        System.out.println(p2.toString());
        
        System.out.println(p3.toString());
        
        System.out.println(p4.toString());
        
        
    }
    
}
