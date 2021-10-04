
package br.com.abc.javacore.modificadoresEstatico.test;

import br.com.abc.javacore.modificadoresEstatico.classes.Carro;


public class carroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        
//        Carro c1 = new Carro("BMW", 280);
//        Carro c2 = new Carro("Audi", 275);
//        Carro c3 = new Carro("Mercedes", 290);
        Carro.setVelocidadeMaxima(180);
        Carro.setNome("Maclaren");
        for(int i = 0; i<=5;i++){
        Carro.imprime();
//        Carro.imprime();
//        Carro.imprime();
        
        System.out.println("*****************************");
        }      
//        c1.imprime();
//        c2.imprime();
//        c3.imprime();
    }
}
