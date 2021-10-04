

package br.com.abc.javacore.Exceptions.CustomException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("usuario: ");
        String usuario = sc.next();
        System.out.println("senha: ");     
        String senha = sc.next();
        boolean verificar = false;     
        try {
            logar(usuario,senha);
            System.out.println("Verificado");
            verificar = true;
        } catch (LoginInvalidoException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            ex.getMessage();
        }
        if(verificar == true){
            System.out.println("Validação feita com sucesso");
        }
    }*/
    public static void logar(String usuario, String senha) throws LoginInvalidoException{
        
        String usuarioBancoDeDados = "warofthesystem";
        String SenhaBancoDeDados = "f8cf8644";
        if(!usuarioBancoDeDados.equals(usuario) || !SenhaBancoDeDados.equals(senha)){
            throw new LoginInvalidoException();   
        }
    }
}
