package br.com.abc.javacore.tJDBC.conn.DB;

import br.com.abc.javacore.tJDBC.conn.ConexaoFactory;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Veiculo {

    private String placa;
    private String modelo;
    private BigDecimal preco;
    private Integer tipoVeiculo;
    private Integer anoModelo;
    private String descricao;
    private final LocalDate data = LocalDate.now();
    private final StringBuilder sql = new StringBuilder();
    private List<Veiculo> veiculo = new ArrayList<>();

    public Veiculo() {
    }
 void save() {
        if ((placa != null && placa.length() == 8) && modelo != null && preco != null && tipoVeiculo != 0 &&(anoModelo.toString().length() == 4 && (anoModelo > 1980 && anoModelo <= data.getYear())) && descricao != null) {
            sql.append("INSERT INTO agencia.veiculo (placa, modelo, preco, id_tipo_veiculo, ano_modelo, descricao) VALUES (?,?,?,?,?,?)");
            Connection conn = ConexaoFactory.getConexao();
            try {                
                PreparedStatement stat = conn.prepareStatement(sql.toString());
                stat.setString(1, placa);
                stat.setString(2, modelo);
                stat.setBigDecimal(3, preco);
                stat.setInt(4, tipoVeiculo);
                stat.setInt(5, anoModelo);
                stat.setString(6, descricao);
                stat.execute();
                stat.close();                
                ConexaoFactory.close(conn, stat);
                System.out.println("Cadastro finalizado com sucesso");
            } catch (SQLException ex) {
                ex.printStackTrace();
                ConexaoFactory.close(conn);
            }
        } else {
            System.out.println("[ERRO] não foi possivel finalizar o cadastro"
                    + "\nverifique os dados e tente novamente.");
        }

    }

    public void consulta() throws NullPointerException {
        try {
            Connection conn = ConexaoFactory.getConexao();
            if (!(placa == null && modelo == null && preco == null && anoModelo == null && descricao == null && tipoVeiculo == null)) {

                sql.append("SELECT * FROM agencia.carro ca "
                        + "LEFT JOIN agencia.comprador co on co.id = ca.id_comprador WHERE ca.id > 0");

                if (placa != null) {
                    sql.append(" and ca.placa = '").append(placa.trim()).append("'");
                }
                if (modelo != null) {
                    sql.append(" and ca.modelo like '%").append(modelo.trim()).append("%'");
                }
                if (preco != null) {
                    sql.append(" and ca.preco = ").append(preco);
                }
                if (tipoVeiculo != null){
                    sql.append(" and ca.id_tipo_veiculo = ").append(tipoVeiculo);
                }

            }
            try {
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(sql.toString());
                
                while (rs.next()) {
                    Veiculo vei = (Veiculo) rs;
                    veiculo.add(vei);
                    System.out.printf("\n\nDados do veículo\n");
                    System.out.println("nome: " + rs.getString("modelo"));
                    System.out.println("placa: " + rs.getString("placa"));
                    System.out.println("preço: " + rs.getBigDecimal("preco"));
                    System.out.println("################");
                    System.out.println(vei.anoModelo);
                }
                ConexaoFactory.close(conn, stat);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.placa);
        hash = 83 * hash + Objects.hashCode(this.modelo);
        hash = 83 * hash + Objects.hashCode(this.preco);

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
        final Veiculo other = (Veiculo) obj;
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.preco, other.preco);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(Integer tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

}
