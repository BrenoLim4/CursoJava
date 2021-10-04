package br.com.abc.javacore.associacao.classes;

public class Seminario {

    private Aluno[] alunos;
    private Professor professor;
    private Local local;
    private String titulo;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {

    }

    public void print() {
        System.out.println("------------Relatorio de seminario------------");
        System.out.println("Seminario: " + this.titulo);
        if (this.professor != null) {
            System.out.println("Professor palestrante: " + this.professor.getNome());
        } else {
            System.out.println("Nenhum professor cadastrado nesse seminario");
        }
        if (this.local != null) {
            System.out.println("cidade: " + this.local.getBairro() + " / estado: " + this.local.getEstado());
        } else {
            System.out.println("Local ainda não foi definido.");
        }
        if (this.alunos != null && alunos.length != 0) {
            System.out.println("Alunos Participantes: ");
            for (Aluno aluno : alunos) {
                System.out.println("- " + aluno.getNome());
            }
            return;
        }
        System.out.println("Ainda não temos alunos inscritos nesse seminário.");
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
