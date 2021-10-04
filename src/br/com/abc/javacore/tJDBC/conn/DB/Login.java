package br.com.abc.javacore.tJDBC.conn.DB;

import br.com.abc.javacore.Exceptions.CustomException.LoginInvalidoException;
import br.com.abc.javacore.tJDBC.conn.ConexaoFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Login {

    private final StringBuilder sql = new StringBuilder();
    private String vendedor;

    public Login() {

    }

    public void verificarLogin(String usuario, String senha) throws LoginInvalidoException, NullPointerException {
        if (usuario != null && senha != null) {
            try {
                Connection conn = ConexaoFactory.getConexao();
                sql.append("SELECT pa.login, pa.senha, ve.nome "
                        + "FROM agencia.pass pa "
                        + "LEFT JOIN agencia.vendedor ve on ve.id = pa.id_vendedor "
                        + "WHERE pa.login = '").append(usuario).append("' and pa.senha = '").append(senha).append("'");

                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(sql.toString());

                if (rs.next() == true) {                    
                    vendedor = rs.getString("nome");
                } else {
                    throw new LoginInvalidoException();
                }
                ConexaoFactory.close(conn, stat);
            } catch (SQLException | NullPointerException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if (!Objects.equals(this.vendedor, other.vendedor)) {
            return false;
        }
        if (!Objects.equals(this.sql, other.sql)) {
            return false;
        }
        return true;
    }

    public String getVendedor() {
        return vendedor;
    }

}
