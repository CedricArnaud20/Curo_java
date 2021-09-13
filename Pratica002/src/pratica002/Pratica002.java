
package pratica002;

public class Pratica002 {

   
    public static void main(String[] args) {
           mochila m1 = new mochila();
           
           m1.cor = "vermelha"; // instanciação de classe
           m1.modelo = "mochila para pc";
           m1.preço = 85;
           m1.grande(); //methodos
           
           m1.estado();
           m1.carregar();
           
           mochila m2 = new mochila();
           m2.cor = "verde";
           m2.modelo = "Mochila para lunch"; 
           m2.preço = 30;
           m2.pequeno();
           
           m2.estado();
           m2.carregar();
           
           
    }
    
}
