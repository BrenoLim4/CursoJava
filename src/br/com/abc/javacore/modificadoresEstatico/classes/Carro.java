
package br.com.abc.javacore.modificadoresEstatico.classes;


public class Carro {
    //velocidade limite deve ser de 240km
    private static String nome;
    private static double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        Carro.nome = nome;
        Carro.velocidadeMaxima = velocidadeMaxima;
    }
    public static void imprime() {
        System.out.println("-----------------------------------------");
        System.out.println("nome: " + nome);
        System.out.println("velocida maxima: " + velocidadeMaxima);
        System.out.println("velocidadeLimite: " + velocidadeLimite);
    }
    public Carro(){
                
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }
    public static String getNome() {
        return nome;
    }

    public static void setNome(String name) {
        nome = name;
    }

    public static double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public static void setVelocidadeMaxima(double velocidadeMaxima) {
        Carro.velocidadeMaxima = velocidadeMaxima;
    }

 
    
    
}
