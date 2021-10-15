package br.com.abc.javacore.Heranca.classe;

import java.util.Objects;

public class Pessoa extends Object{

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
                + "\nidade= " + idade + "\ncategoria= " + categoria + '}';
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
}
