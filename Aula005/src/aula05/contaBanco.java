package aula05;

public class contaBanco {
    public int numConta;
    protected  String tipo;
    protected String dono;
    private float saldo;
    private Boolean status;
    
    
// métodos personalizado
    
  public void estadoAtual(){
      System.out.println("Conta: " + this.getNumConta());
      System.out.println("Tipo: " + this.getTipo());
      System.out.println("Dono: " + this.getDono());
      System.out.println("Slado: " + this.getSaldo());
      System.out.println("Status: " + this.getStatus());
  }   
    
  public void abrirConta(String t ){
      this.setTipo(tipo);
      this.setStatus(status);
      if (t == "CC"){
          this.setSaldo(50);
      } else if (t == "CP"){
          this.setSaldo(150);
      }
      System.out.println("  Conta aberta com sucesso");
  }
 

  public void fecharConta(){
      if (this.getSaldo() > 0){
          System.out.println("Conta não pde ser fechada porque ainda tem dinheiro");
      } else if (this.getSaldo() < 0){
           System.out.println("Conta não pode ser fechada "); 
      } else {
          System.out.println("Conta fechada com sucesso");
      }
      
  }
  
  public void depositar(float v){
      if (this.getStatus()) {
          this.setSaldo(this.getSaldo()+ v);
          System.out.println(" depósito realiado com sucesso" + this.getDono());    
      } else {
          System.out.println("Impossível depositar em uma conta fechada!");
      }
      
  }
  
  public void sacar(float v){
      if (this.getStatus()) {
          if (this.getSaldo() >= v) {
              this.setSaldo(this.getSaldo() - v);
              System.out.println("Saque realizado na conta de" + this.getDono());
            }else {
              System.out.println("Saldo insufuciente para saque");
          }
      }else{
          System.out.println("Impossícel sacar de uma conta fechada");
      }
  }
  
  public void pagaConta(){
     int v = 0;
      if (this.getTipo() == "CC") {
          v = 12;
      } else if (this.getTipo() == "CP")  {
          v = 20;
      }
      if (this.getStatus()){
          this.setSaldo(this.getSaldo() - v);
          System.out.println("Mensalidade paga por " + this.getDono());
      } else{
          System.out.println("Impossível pagar uma conta fechada");
      }
  }
  
  // métodos especiais 

    public contaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
     
    
    
}