
package aula002objetoeclasse;


public class Aula002 {

    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.modelo = "BIC cristal";
       c1.cor = "azul";
    //   c1.ponta =;
       c1.carga = 80;
     //  c1.tampada = true;
       c1.destampar();
       c1.status();
       c1.rabiscar();
     
    }
    
}
