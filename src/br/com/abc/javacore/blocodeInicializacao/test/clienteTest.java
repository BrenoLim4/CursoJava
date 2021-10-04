
package br.com.abc.javacore.blocodeInicializacao.test;

import br.com.abc.javacore.blocodeInicializacao.classes.Cliente;


public class clienteTest {
    public static void main(String[] args) {   
    Cliente c = new Cliente();
        System.out.println("exibindo a quantidade de parcelas possiveis");
        for(int parcela : c.getParcelas()){
            System.out.print(parcela +" ");
        }
   }  
}
