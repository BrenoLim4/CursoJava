
package br.com.abc.javacore.Polimorfismo.teste;


import br.com.abc.javacore.Polimorfismo.classe.Gerente;
import br.com.abc.javacore.Polimorfismo.classe.Vendedor;
import br.com.abc.javacore.Polimorfismo.classe.relatorioPagamento;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Brenoaldo", 5000, 2000);
        Vendedor v = new Vendedor("carlinha", 2000, 20000, 9);
        relatorioPagamento relatorio = new relatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        relatorio.relatorioPagamentoVendedor(v);
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("########################");
        relatorio.relatorioPagamentoGenerico(v);
        
    }
}
