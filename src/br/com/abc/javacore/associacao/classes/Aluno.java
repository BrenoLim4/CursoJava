package br.com.abc.javacore.associacao.classes;

public class Aluno {

    private Seminario seminario;
    private String nome;
    private int idade;
    
    
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {

    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
    public void print(){
        System.out.println("---------Relatorio aluno---------");
        System.out.println("Aluno: " +this.nome);
        System.out.println("idade: "+ this.idade);
        if (this.seminario != null){
        System.out.println("Seminario inscrito "+ this.seminario.getTitulo());
        return;
        } 
        System.out.println("Aluno não esta inscrito em nenhum seminario");
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
