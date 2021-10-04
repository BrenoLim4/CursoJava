
package br.com.abc.javacore.sobrecargaseConstrutores.testes;

import br.com.abc.javacore.sobrecargaseConstrutores.classes.Estudante;


public class estudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("43239c","Eduardo Breno", new double[]{3,7,5},"23/11/2018");
        est.imprime();
    }
   
}
