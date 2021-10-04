
package br.com.abc.javacore.classesAbstratas.test;

//import br.com.abc.javacore.classesAbstratas.classe.Funcionario;
import br.com.abc.javacore.classesAbstratas.classe.Gerente;
import br.com.abc.javacore.classesAbstratas.classe.vendedor;
import java.util.Scanner;


public class funcionarioTest {
    public static void main(String[] args) {
        //Funcionario f = new Funcionario("Breno Lima", "2038-23", 2000);
        Gerente g = new Gerente("Lapiao", "4356-21", 3000);
        vendedor v = new vendedor("Francisco", "54332-32", 1200);
       // v.setCargo("gerente");
       Scanner sc = new Scanner(System.in);
       System.out.println("Quantas vendas o vendedor " + v.getNome() + " fez nesse mes.");
       int totalVendas = sc.nextInt();
        v.setTotalVendas(totalVendas);
        v.aumetentoSalario();
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(g);
        System.out.println(v);
        System.out.println("comissao do vendedor: "+ v.getTotalVendas(totalVendas));
    }
}
