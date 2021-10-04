
package br.com.abc.javacore.introducaodeClasses.test;

import br.com.abc.javacore.introducaodeClasses.classes.Estudante;

public class EstudanteTest {
public static void main (String[] args){
    Estudante aluno = new Estudante();
    aluno.nome = "Breno";
    aluno.matricula = "202020004";
    aluno.idade = 20;
    aluno.semestre = 2;
    
    System.out.printf("nome: %s\nmatricula: %s\nIdade: %d\nsemestre: %d¨semestre.\n",aluno.nome, aluno.matricula, aluno.idade, aluno.semestre);
}    
}
