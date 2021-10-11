package aula12;


public class peixe extends Animal{
    private String  cordaPerna;
    
    @Override
    public void locomer() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Soltou uma bolha");
    }

    
 
    
    public String getCordaPerna() {
        return cordaPerna;
    }

    public void setCordaPerna(String cordaPerna) {
        this.cordaPerna = cordaPerna;
    }
    
    
    
}
