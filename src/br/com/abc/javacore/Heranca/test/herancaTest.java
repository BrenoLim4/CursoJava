
package br.com.abc.javacore.Heranca.test;

import br.com.abc.javacore.Heranca.classe.Endereco;
import br.com.abc.javacore.Heranca.classe.Funcionario;
import br.com.abc.javacore.Heranca.classe.Pessoa;


public class herancaTest {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        Endereco end = new Endereco("Rua 25","bairro 1");
        pessoa.setEndereco(end);
        System.out.println("-------------------------");
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setEndereco(end);
        
        
        //funcionario.setNome("Roberto");
        //funcionario.setCpf("620.867.343-32");
        funcionario.setEndereco(end);
        //funcionario.setSalario(13670.32);
        
        System.out.println("---------------------------------\n");
        System.out.println(funcionario);
        System.out.println(funcionario2);
        
        
    }
   
}
