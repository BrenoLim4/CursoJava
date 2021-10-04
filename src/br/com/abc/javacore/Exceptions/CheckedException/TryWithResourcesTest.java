
package br.com.abc.javacore.Exceptions.CheckedException;


import java.util.logging.Level;
import java.util.logging.Logger;


public class TryWithResourcesTest {
    public static void main(String[] args) {
        try {
            lerArquivo();
        } catch (Exception ex) {
            Logger.getLogger(TryWithResourcesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void lerArquivo() throws Exception{
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){   
            
        } 
}
}