package br.com.abc.introducao.aplicacoes;

import br.com.abc.javacore.tJDBC.conn.DB.FinanciarVeiculo;
import br.com.abc.javacore.Exceptions.CustomException.LoginInvalidoException;
import br.com.abc.javacore.Exceptions.CustomException.Login;
import static br.com.abc.javacore.Exceptions.CustomException.Login.logar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FinanciarAutomoveis {

    public static void main(String[] args) {
        System.out.println("Faça login para ter acesso ao serviço.");
        Scanner sc = new Scanner(System.in);
        System.out.println("usuario: ");
        String usuario = sc.next();
        System.out.println("senha: ");
        String senha = sc.next();
        boolean verificao = false;
        try {
            logar(usuario, senha);
            verificao = true;
        } catch (LoginInvalidoException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (verificao == true) {
            for (int i = 0; i <= 400; i++) {
                System.out.println("\r\n");
            }
            System.out.println("\n###########Validação feita com sucesso###########");
            FinanciarVeiculo financiamento = new FinanciarVeiculo();
            try {
                financiamento.preencherDados();
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("caractere invalido");
            }
        }
    }
}
