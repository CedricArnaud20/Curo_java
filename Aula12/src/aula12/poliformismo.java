package aula12;


public class poliformismo {
    public static void main(String[] args) {
        
        mamifero m = new mamifero();
        reptis r =new reptis();
        peixe p = new  peixe();
        Aves a = new  Aves();
        Canguru c = new  Canguru();
        Cobra s = new  Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara v = new Arara();
        Cachorro k = new Cachorro();
       
        k.locomer();
        k.emitirSom();
        
    }
    
}
