
package aula002objetoeclasse;


public class Caneta {
    
    public String modelo;
    public String  cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("está tampada? " + this.tampada);
    }
    
    protected void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro não pode escrever");
        }else{
            System.out.println("Estou rabiscando");
        }
        
    } 
    public void tampar() {
         this.tampada = true;   
    }
   public void destampar(){
         this.tampada = false;
        
    }
    
}
