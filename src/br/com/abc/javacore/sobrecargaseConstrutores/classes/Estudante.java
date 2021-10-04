package br.com.abc.javacore.sobrecargaseConstrutores.classes;

//import java.util.Arrays;
public class Estudante {

    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas);//so pode chamar construtores dentro de outro cunstrutor e tem sempre que esta na primeira linha
        this.dataMatricula = dataMatricula;
    }

    public Estudante() {

    }

    public void imprime() {
        System.out.println("nome: " + this.nome);
        System.out.println("matricula: " + this.matricula);
        // System.out.println("notas: " + Arrays.toString(this.notas));
        for (double nota : notas) {
            System.out.println(nota + "");
        }
        System.out.println("data de matricula " + this.dataMatricula);

    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double[] getNotas() {
        return this.notas;
    }
    public void setDataMatricula(String dataMatricula){
        this.dataMatricula = dataMatricula;
    }
    public String getDataMatricula(){
        return this.dataMatricula;
    }
}
