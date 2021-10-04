
package br.com.abc.javacore.interfaces.test;

import br.com.abc.javacore.interfaces.classes.Produto;


public class testProduto {
    public static void main(String[] args) {
        Produto p = new Produto("computador",10,6000);        
        p.calculaImposto();
        p.calculaFrete();
        p.valorImposto();
        System.out.println(p);
    }
}
