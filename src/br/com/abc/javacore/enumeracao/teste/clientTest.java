
package br.com.abc.javacore.enumeracao.teste;

import br.com.abc.javacore.enumeracao.classes.Cliente;
import br.com.abc.javacore.enumeracao.classes.TipoCliente;


public class clientTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Roberto", TipoCliente.IMOVEIS, Cliente.TipoPagamento.Avista);
        System.out.println(cliente);
    }
    
}
