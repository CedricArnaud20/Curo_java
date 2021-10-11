package aula12;

public class mamifero extends Animal{
    private String CorPelo;
    
    @Override
    public void locomer() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorPelo() {
        return CorPelo;
    }

    public void setCorPelo(String CorPelo) {
        this.CorPelo = CorPelo;
    }

    
  
    
    
    
    
    
}
