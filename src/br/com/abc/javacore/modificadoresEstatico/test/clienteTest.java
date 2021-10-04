
package br.com.abc.javacore.modificadoresEstatico.test;

import br.com.abc.javacore.modificadoresEstatico.classes.Cliente;



public class clienteTest {
    public static void main(String[] args) {   
    Cliente c = new Cliente();
    Cliente c1 = new Cliente();
    Cliente c2 = new Cliente();
        System.out.println("exibindo a quantidade de parcelas possiveis");
        for(int parcela : c.getParcelas()){
            System.out.print(parcela +" ");
        }
        System.out.println("\ntamanho: "+ Cliente.getParcelas().length);
        
   }  
}
