package aula11;
public class Aula11 {
    public static void main(String[] args) {
     
       // Visitante V1 = new Visitante();
       // V1.setNome("Cedric");
      // V1.setIdade(22);
      //  V1.setSexo("M");
      //  System.out.println(V1.toString());
         
        aluno a1 = new aluno();
        a1.setNome("ARNAUD");
        a1.setCurso("Informática");
        a1.setMatricula(201138);
        a1.setIdade(20);
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsisita b1 = new Bolsisita();
        b1.setMatricula(1111);
        b1.setNome("James");
        b1.setSexo("M");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        professor p1 = new professor();
        p1.setNome("john");
        p1.setEspecialidade("mestrado");
        p1.receberSalario(5000.25f);
        
             
    }
    
}
