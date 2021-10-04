
package br.com.abc.javacore.introducaodeClasses.test;

import br.com.abc.javacore.introducaodeClasses.classes.Carro;


public class carroTest {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.modelo = "ferrari";
        car.placa = "OSM1369";
        car.velocidadeMaxima = 101f;
        System.out.println(car.placa);
        System.out.println(car.modelo);
        System.out.println(car.velocidadeMaxima);
        
        
    }
    
}
