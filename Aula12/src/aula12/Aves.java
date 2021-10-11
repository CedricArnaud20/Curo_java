package aula12;
public  class Aves extends Animal{
   private String CordaPerna;

    @Override
    public void locomer() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som deave");
    }
    public void fazerNinho(){
        System.out.println("Construido ninho");
    }

    
    
    public String getCordaPerna() {
        return CordaPerna;
    }

    public void setCordaPerna(String CordaPerna) {
        this.CordaPerna = CordaPerna;
    }
    
    
  
}
