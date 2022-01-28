package br.com.abc.javacore.Heranca.classe;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Objects;

public class Pessoa extends Object implements Comparable<Pessoa>{

    protected String nome;
    protected String cpf;
    private   Integer   idade;
    private   Character categoria; 
    private   Boolean   teste = Boolean.FALSE;
    protected Endereco endereco;
    private Double salario;
    private String cargo;
    

    public Pessoa(String nome, String cpf, Integer idade, Character categoria, Double salario, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.categoria = categoria;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Pessoa() {
    }
    
    public static List<Pessoa> getList(){
        List<Pessoa> list = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Breno", "629.543", 17, 'B', 2000d, "Auxiliar tecnico");
        Pessoa pessoa2 = new Pessoa("Elma", "629.543", 40, 'A', 1000d, "Medico");
        Pessoa pessoa3 = new Pessoa("Ezson", "867.876", 30, 'B', 1000d, "Bancario");
        Pessoa pessoa4 = new Pessoa("Eduarda", "324.476", 12, 'C', 4000d, "Engenheiro");
        Pessoa pessoa5 = new Pessoa("Emerson", "867.453", 18, 'B', 2500d, "engenheiro civil");
        Pessoa pessoa6 = new Pessoa("Thaina", "234.535", 55, 'A', 700d, "Motoboy");
        list.addAll(asList(pessoa1,pessoa2, pessoa3,pessoa4,pessoa5,pessoa6));
        return list;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.cpf);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.idade, other.idade);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome= " + nome + "\ncpf= " + cpf
                + "\nidade= " + idade + "\ncategoria= " + categoria + " salario =" + salario.toString() +'}';
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public Boolean getTeste() {
        return teste;
    }

    public void setTeste(Boolean teste) {
        this.teste = teste;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Character getCategoria() {
        return categoria;
    }

    public void setCategoria(Character categoria) {
        this.categoria = categoria;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.idade.compareTo(o.idade);
        //To change body of generated methods, choose Tools | Templates.
    }
}
