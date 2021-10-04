package br.com.abc.javacore.tJDBC.conn.test;

import br.com.abc.javacore.Exceptions.CustomException.LoginInvalidoException;
import br.com.abc.javacore.tJDBC.conn.DB.Login;
import br.com.abc.javacore.tJDBC.conn.DB.Vendedor;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("Faça login para ter acesso ao sistema");
            System.out.printf("usuario: ");
            String usuario = sc.next();
            System.out.println("senha: ");
            String senha = sc.next();
            Login log = new Login();
            try {
                log.verificarLogin(usuario, senha);
                int button;
                Vendedor vendedor = new Vendedor();
                vendedor.setNome(log.getVendedor());
                System.out.println("Bem vindo, " + vendedor.getNome());
                do {
                    System.out.println("Menu: "
                            + "\n1 - cadastrar veiculo"
                            + "\n2 - cadastrar comprador"
                            + "\n3 - Consultar veiculos disponíveis"
                            + "\n4 - Alterar senha"
                            + "\n5 - Vender veiculo"
                            + "\n6 - logout");
                    sc.reset();
                    button = sc.nextInt();
                    switch (button) {
                        case 1:
                            vendedor.cadastarVeiculo();
                            break;
                        case 2:
                            vendedor.cadastrarComprador();
                            break;
                        case 3:
                           // vendedor.consultarveiculos();
                            break;
                        case 4:
                            //vendedor.alterarSenha();
                            break;
                        case 5:
                            vendedor.venderVeiculo();
                            break;
                    }

                } while (button != 6);
            } catch (LoginInvalidoException | NullPointerException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (exit != true);

    }
}
