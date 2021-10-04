
package br.com.abc.javacore.Exceptions.RumTimeException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;


public class MultRunTimeException {
    public static void main(String[] args) {
        try {
            talvezLanceException(2);
        }catch(SQLException | FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
    public static void talvezLanceException(int aux) throws SQLException, FileNotFoundException{
        if(aux == 1){
            throw new SQLException("Valor 1 nao possui em nosso banco de dados");
        } else if(aux ==2){
            throw new FileNotFoundException("Valor 2 nao correspondente");
        }
        
    }
}
