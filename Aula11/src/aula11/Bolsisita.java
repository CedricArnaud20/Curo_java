package aula11;

public class Bolsisita extends aluno{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bosla de " + this.nome);
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
