package br.com.abc.javacore.exercicioMetodos;

public class Estudantes {

    public String name;
    public int age;
    public double[] note;
    public String situation;

    public void fimEletivo() {
        double soma = 0;
        for (double num : note) {
            soma += num;
        }
        double avarege = soma / note.length;
        if (avarege >= 6) {
            situation = "aprovado";
        } else {
            situation = "reprovado";
        }
        System.out.println("Nome: " + this.name);
        System.out.println("idade: " + this.age);
        System.out.printf("media: %.2f\n", avarege);
        System.out.println("situação: " + this.situation);
    }
}
