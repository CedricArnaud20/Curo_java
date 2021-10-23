package produtos;

public class Nacional extends Produtos{

    @Override
    public void tipoProdutos() {
        System.out.println("Produto nacional ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Etiqueta protudo nacional{" + nome + preco +'}';
    }
    
    
    
}
