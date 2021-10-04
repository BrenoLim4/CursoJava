
package br.com.abc.javacore.Polimorfismo.teste;

import br.com.abc.javacore.Polimorfismo.classe.DataBaseDAOimp;
import br.com.abc.javacore.Polimorfismo.classe.GenericDAO;


public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new DataBaseDAOimp();
        arquivoDAO.save();
    }
}
