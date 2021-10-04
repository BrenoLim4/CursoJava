package br.com.abc.javacore.associacao.classes;

public class Professor {//cardinalidade

    private Seminario[] seminarios;
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void print() {
        System.out.println("-----------Relatorio professor------------");
        System.out.println("professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("# Seminarios ministrados");
        if (this.seminarios != null && seminarios.length != 0) {
            for (Seminario sem : seminarios) {
                System.out.println(" - " + sem.getTitulo());
            }
        } else {
            System.out.println("Professor não está inscrito em nenhum seminario.");
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
