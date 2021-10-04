
package br.com.abc.javacore.sobrescritaMetodos.tests;

import br.com.abc.javacore.sobrescritaMetodos.classes.Pessoa;


public class pessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Breno Lima");
        pessoa.setIdade(200);
        System.out.println(pessoa);
    }
    
}
