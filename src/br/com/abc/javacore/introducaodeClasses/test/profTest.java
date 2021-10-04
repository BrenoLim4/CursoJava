
package br.com.abc.javacore.introducaodeClasses.test;

import br.com.abc.javacore.introducaodeClasses.classes.professor;


public class profTest {
    public static void main(String[] args) {
        professor cadastro = new professor();
        cadastro.nome = "Sergio Fontinele de Azevedo";
        cadastro.matricula = "23092021";
        cadastro.Rg = "239.434.345.8";
        cadastro.cpf =  "620.869.893-69";
        
        professor cadastro2 = new professor();
        cadastro2.nome = "Francisco Ramos da fonseca";
        cadastro2.matricula = "23402021";
        cadastro2.Rg = "245.454.745.9";
        cadastro2.cpf =  "626.876.654-79";
        
        System.out.println("Nome:" + cadastro.nome);
        System.out.println("Matricula:" + cadastro.matricula);
        System.out.println("Rg:" + cadastro.Rg );
        System.out.println("CPF: " + cadastro.cpf);
        System.out.println("-------------");
        System.out.println("Nome:" + cadastro2.nome);
        System.out.println("Matricula:" + cadastro2.matricula);
        System.out.println("Rg:" + cadastro2.Rg );
        System.out.println("CPF:" + cadastro2.cpf);
        
               
    }

    
}
