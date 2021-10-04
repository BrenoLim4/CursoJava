
package br.com.abc.javacore.associacao.test;

import br.com.abc.javacore.associacao.classes.Aluno;
import br.com.abc.javacore.associacao.classes.Local;
import br.com.abc.javacore.associacao.classes.Professor;
import br.com.abc.javacore.associacao.classes.Seminario;


public class associacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Elma", 21);
        Aluno aluno2 = new Aluno("Joana", 15);
        Aluno aluno3 = new Aluno("Joao gabriel", 26);
        Aluno aluno4 = new Aluno("Fernando", 37);
        Aluno aluno5 = new Aluno("Lucas", 23);
        
        
        Seminario sem = new Seminario("Teoria da relatividade");
        Seminario sem2 = new Seminario("As leis da termodinâmica");
        Seminario sem3 = new Seminario("Fisica quântica");
        Seminario sem4 = new Seminario("Sistemas distribuidos");
        Seminario sem5 = new Seminario("Ads- Analise desenvolvimento de Sistemas");
        Seminario sem6 = new Seminario("Roubo e furto qualificado");
        
        Professor prof = new Professor("Breno Lima", "Fisico Astronômico");
        Professor prof2 = new Professor("Robson Almeida", "Desenvolvedor de Software");        
        Professor prof3 = new Professor("Roberto Gaguin","Ladroagem");
        
        Local local = new Local("Guarujá", "São Paulo");
        Local localSem4 = new Local("Washington","Nova york");
        
        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);
        aluno3.setSeminario(sem4);
        aluno4.setSeminario(sem4);
        aluno5.setSeminario(sem4);
        
        Aluno[] arrayAlunosSem4 = new Aluno[3];
        arrayAlunosSem4[0] = aluno3;
        arrayAlunosSem4[1] = aluno4;
        arrayAlunosSem4[2] = aluno5;
        sem4.setAlunos(arrayAlunosSem4);
        sem4.setLocal(localSem4);
        sem4.setProfessor(prof2);
        
        sem.setProfessor(prof);
        sem.setLocal(local);
        Aluno[] arrayAluno = new Aluno[2];
        arrayAluno[0] = aluno;
        arrayAluno[1] = aluno2;
        //sem.setAlunos(new Aluno[]{aluno, aluno2});
        sem.setAlunos(arrayAluno);
       
        Seminario[] sem6Array = new Seminario[1];
        sem6Array[0] = sem6;
        prof3.setSeminarios(sem6Array);
        
        Seminario[] semArray = new Seminario[3];
        semArray[0] = sem;
        semArray[1] = sem2;
        semArray[2] = sem3;
        prof.setSeminarios(semArray);
        
        Seminario[] sem4Array = new Seminario[2];
        sem4Array[0] = sem4;
        sem4Array[1] = sem5;        
        prof2.setSeminarios(sem4Array);
        
        //prof.setSeminarios(new Seminario[]{sem, sem2,sem3});
       prof.print();
        prof2.print();
        
       //aluno5.print();
        //local.print();
        sem.print();
        sem4.print();
        
        //prof3.print();
    }
}
