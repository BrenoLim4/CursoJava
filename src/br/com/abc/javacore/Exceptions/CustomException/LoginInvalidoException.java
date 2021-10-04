
package br.com.abc.javacore.Exceptions.CustomException;


public class LoginInvalidoException extends Exception{
    public LoginInvalidoException(){
        super("Usuario ou senha invalidos.");
    }
}
