package aula05;

public class Aula05comObjeto {

    
    public static void main(String[] args) {
       contaBanco p1 = new contaBanco();
       p1.setNumConta(11111);
       p1.setDono("Cedric");
       p1.abrirConta("CC");
       
       contaBanco p2 = new contaBanco();
       p2.setNumConta(2222);
       p2.setDono("Arnaud");
       p2.abrirConta("CP");
       
   
       
    }
    
}
