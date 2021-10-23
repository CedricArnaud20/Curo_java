package produtos;

public class ProdutosMain {
    public static void main(String[] args) {
       
        Nacional n = new Nacional();
        
        n.tipoProdutos();
        n.setNome("Chevrolet");
        n.setPreco(45000);
        System.out.println(n.toString());
        
        Importado i = new Importado();
        i.tipoProdutos();
        i.setNome("Tesla");
        i.setPreco(300000);
        System.out.println(i.toString());
        i.taxaImport();
        i.setTax(60);
    }
    
}
