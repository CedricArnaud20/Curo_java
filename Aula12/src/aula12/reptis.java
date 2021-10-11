package aula12;

public class reptis extends Animal{
    private String corEscama;
    
    @Override
    public void locomer() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptíl");
    }

    
    
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
