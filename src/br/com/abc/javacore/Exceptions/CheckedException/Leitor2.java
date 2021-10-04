
package br.com.abc.javacore.Exceptions.CheckedException;


public class Leitor2 implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("fechando leitor2");
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
