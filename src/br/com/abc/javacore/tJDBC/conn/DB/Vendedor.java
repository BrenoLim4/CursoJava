package br.com.abc.javacore.tJDBC.conn.DB;

import br.com.abc.javacore.tJDBC.conn.ConexaoFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vendedor {
    private String nome;
    private final StringBuilder sql = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    
    
    public void venderVeiculo(){
        System.out.println("");
    }
    public void salvarVenda(){
        
    }
    public void cadastarVeiculo() {
        Veiculo vel = new Veiculo();
         
            System.out.println("Preencha todos os campos");
            System.out.println("placa");
            vel.setPlaca(sc.next().toUpperCase().trim());
            System.out.println("modelo");
            vel.setModelo(sc.next().toLowerCase().trim());
            System.out.println("preco");
            sc.nextLine();
            vel.setPreco(sc.nextBigDecimal());
            System.out.println("tipo do veiculo");
            System.out.println("[1]-moto | [2]-carro | [3]-caminhao");
            int aux = sc.nextInt();
            sc.nextLine();
            if (aux >= 1 && aux <= 3) {
                vel.setTipoVeiculo(aux);
                System.out.println("ano do veiculo");
                vel.setAnoModelo(sc.nextInt());
                sc.nextLine();
                System.out.println("descricao do veiculo");
                vel.setDescricao(sc.next().toLowerCase());
            }
                System.out.println("Salvar? [1]-sim | [2]-nao");
                int sav = sc.nextInt();
                
                switch (sav) {
                    case 1:
                        vel.save();
                        break;
                    case 2:
                        System.out.println("Cadasto não finalizado");
                        break;
                    default:
                        System.out.println("Opção inválida");

                }
            
        
    }
    public void cadastrarComprador(){
        Comprador com = new Comprador();
        System.out.println("preencha todos os campos");
        System.out.println("cpf: ");
        com.setCpf(sc.next().trim());
        System.out.println("nome: ");
        com.setNome(sc.next());
        System.out.println("cidade: ");
        com.setCidade(sc.next().trim());
        System.out.println("idade: ");
        com.setIdade(sc.nextInt());
        com.save();        
    }
    
    public void alterarSenha() {
        System.out.println("digite a senha antiga");
        String senha = sc.next();
        sql.append("SELECT * FROM agencia.pass p LEFT JOIN agencia.vendedor v on v.id = p.id_vendedor"
                + " WHERE p.senha = '").append(senha).append("' and v.nome = '").append(nome).append("'");
        try{
            Connection conn = ConexaoFactory.getConexao();
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql.toString());
            if(rs.next() == true){
                StringBuilder sqlup = new StringBuilder();
                System.out.println("digite nova senha: ");
                senha = sc.next();
                if(senha.equals(rs.getString("senha"))){
                    System.out.println("Senha atual não pode ser igual a antiga");
                    return;
                }
                sqlup.append("UPDATE agencia.pass SET senha = '").append(senha).append("' where id_vendedor = ").append(rs.getInt("id_vendedor"));
                stat.executeUpdate(sqlup.toString());
                System.out.println("senha alterada com sucesso");
                ConexaoFactory.close(conn, stat);
            } else{System.out.println("Senha nao confere");}
        } catch (SQLException ex) {
            Logger.getLogger(Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void consultarveiculos(){
        Veiculo veiculo = new Veiculo();
        System.out.println("preencha os dados a seguir"
                + "\nTipo do veiculo: [1]-moto, [2]-carro, [3]-caminhão");
                veiculo.setTipoVeiculo(sc.nextInt());
                veiculo.consulta();
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
