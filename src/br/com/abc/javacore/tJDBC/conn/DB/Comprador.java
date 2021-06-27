
package br.com.abc.javacore.tJDBC.conn.DB;

import br.com.abc.javacore.tJDBC.conn.ConexaoFactory;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Comprador {
    private String cpf;
    private String nome;
    private Integer idade;
    private String cidade;
    private Date dataNascimento;
    private final StringBuilder sql = new StringBuilder();
    //private DAOFactory DAO = new DAOFactory();

    public Comprador() {
    }
    public void save(){
        if(cpf != null && nome != null && cidade != null && idade != null){
           sql.append("INSERT INTO agencia.comprador (cpf, nome, idade, cidade) VALUES (?,?,?,?)");
            Connection conn = ConexaoFactory.getConexao();
            try {
               try (PreparedStatement sts = conn.prepareStatement(sql.toString())) {
                   sts.setString(1, cpf);
                   sts.setString(2, nome);
                   sts.setInt(3, idade);
                   sts.setString(4, cidade);
                   sts.execute();
                   sts.close();
               }
                ConexaoFactory.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("Cadastrado com sucesso");
        }else {
            System.out.println("Preencha todos os campos");
        }
        
    }
    public void consulta() throws NullPointerException{
        try{
            Connection conn = ConexaoFactory.getConexao();
        if(!(cpf == null && nome == null && idade == null && cidade == null)){
            sql.append("SELECT * FROM agencia.comprador co where id > 0");
            
            if(cpf != null){                
                sql.append(" and co.cpf = '").append(cpf.trim()).append("'");                     
            }
            if(nome != null){
                sql.append(" and co.nome like '%").append(nome).append("%'");
            }
            if(idade != null){
                sql.append(" and co.idade = ").append(idade);
            }
            if(cidade != null){
                sql.append(" and co.cidade = '").append(cidade).append("'");
            }
            
        }
        try {
            Statement stat = conn.createStatement();            
            ResultSet rs = stat.executeQuery(sql.toString());
            while(rs.next()){
                System.out.println("cpf: "+rs.getString("cpf"));
                System.out.println("nome: "+rs.getString("nome"));
                System.out.println("idade: "+rs.getInt("idade"));
                System.out.println("cidade: "+rs.getString("cidade"));
                System.out.println("data de nascimento: "+rs.getString("data_nascimento"));
                System.out.println("################");
            }
            ConexaoFactory.close(conn, stat);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        }catch(NullPointerException ex){
            ex.printStackTrace();
        }
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.idade);
        hash = 79 * hash + Objects.hashCode(this.cidade);
        hash = 79 * hash + Objects.hashCode(this.dataNascimento);
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
        final Comprador other = (Comprador) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        return Objects.equals(this.idade, other.idade);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.trim();
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        try {
            this.dataNascimento = new SimpleDateFormat("yyyy/mm/dd").parse(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Comprador.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
    
    
}
