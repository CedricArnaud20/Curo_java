package pratica002;
//atribuição de classe
public class mochila {
    String modelo;
    String cor;
    float preço;
    boolean tamanho;
   
    //atribuição de methodos e estados 
    void estado(){
        System.out.println("A mochila é do tipo " +this.modelo);
        System.out.println("A mochila é de cor " + this.cor);
        System.out.println("O preço da mochila é de" + this.preço);
        System.out.println("A mochila é grande ?" +this.tamanho);

    }
     void carregar(){
         if (this.tamanho == true) {
             System.out.println("Essa mochila pode carregar muito peso");
         } else {
             System.out.println("Essa mochila carregar pouco peso");
         }
    }
     
     void grande(){
        this.tamanho = true;
    }  
   
    void pequeno(){
        this.tamanho = false;
    } 
   
    
    
    
}
