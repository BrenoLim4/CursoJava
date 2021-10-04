
package br.com.abc.javacore.classesAbstratas.classe;


public abstract class Funcionario {
protected String nome;
protected String clt;
protected double salario;
protected String cargo;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
        
    }

    

    @Override
    public String toString() {
        return "Relatorio funcionario" 
                +"\nnome: " + nome 
                +"\nclt:  " + clt 
                +"\nsalario: " + salario
                +"\ncargo: " + cargo;
    }

    public abstract void calculaSalario();
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
