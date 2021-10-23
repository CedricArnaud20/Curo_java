package aula13;

public class Lobo extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuu");
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        return  "Lobo{"+ "peso = "+ peso + '}';
    }
    
    
    
}
