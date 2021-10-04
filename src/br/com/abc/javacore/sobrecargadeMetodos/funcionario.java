package br.com.abc.javacore.sobrecargadeMetodos;

public class funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String rg;
    
    public funcionario(String nome, String cpf, double salario, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;        
    }
    public funcionario(){
        
    }
    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        
    }
    public void init(String nome, String cpf, double salario, String rg){
        init(nome, cpf, salario);
        this.rg = rg;
    }
    public void imprime(){
        System.out.println("nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("salario R$ " + this.salario);
        System.out.println("Rg: " + this.rg);
        
    }
   
    public void setNome(String nome) {//setar o atributo que esta privado 
        this.nome = nome;
    }

    public void setCpf(String cpf) {//setar o atributo que esta privado 
        this.cpf = cpf;
    }

    public void setSalario(double salario) {//setar o atributo que esta privado 
        this.salario = salario;
    }
    public void setRg(String rg){//setar o atributo que esta privado 
        this.rg = rg;
    }

    public String getNome() {//pegar o atributo e retornar o valor dele.
        return this.nome;
    }

    public String getCpf() {//pegar o atributo e retornar o valor dele.
        return this.cpf;
    }

    public double getSalario() {//pegar o atributo e retornar o valor dele.
        return this.salario;
    }
    public String getRg(){//pegar o atributo e retornar o valor dele.
        return this.rg;
    }
    
}
