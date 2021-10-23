package produtos;
public class Importado extends Produtos {
    private double tax;
            
    @Override
    public void tipoProdutos() {
        System.out.println("Produto importado " );
    }
    
    public void taxaImport(){
        System.out.println("Aplicando taxa de importação a " + this.nome + "de 60%");
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

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
    

    @Override
    public String toString() {
        return " Etiqueta Produto importado { " + nome + preco + tax + '}';
    }
    
 
    
}
