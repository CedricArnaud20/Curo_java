package aula13;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.err.println("Au Au Au!!! ");
    }
    public void idade(){
        System.out.println("20");
    }
    
    public void reagir( String frase){
        if (frase.equals("toma comida")  || frase.equals("Olá")) {
            System.out.println("Abanar ou latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min){
        if (hora<12) {
            System.out.println("Abanar");
        } else if(hora>= 18) {
            System.out.println("Ignorar");
        }else{
            System.out.println("Abana ou Latir");
        }
    }
    public void reagir(boolean dono){
        if (dono = true ) {
            System.out.println("Abanar");
        } else {
            System.out.println("Latir");
        }
    }
    public  void  reagir (int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            }
        } else {
            if (peso > 10) {
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignora");
            }
        }
    }
    
  
}
