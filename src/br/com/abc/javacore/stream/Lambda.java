/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.javacore.stream;

import br.com.abc.javacore.Heranca.classe.Pessoa;
import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author User
 */
public class Lambda {
    public static void main(String[] args) {
        List<Pessoa> list = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Breno", "629.543", 20, 'B');
        Pessoa pessoa2 = new Pessoa("Elma", "543.234", 78, 'A');
        Pessoa pessoa3 = new Pessoa("Edson", "867.876", 26, 'B');
        Pessoa pessoa4 = new Pessoa("Eduarda", "324.476", 12, 'C');
        Pessoa pessoa5 = new Pessoa("Emerson", "867.453", 44, 'B');
        Pessoa pessoa6 = new Pessoa("Thaina", "234.535", 55, 'A');
        list.add(pessoa1);list.add(pessoa2);list.add(pessoa3);list.add(pessoa4);list.add(pessoa5);list.add(pessoa6);
        
        List lista = list.stream().filter(li -> li.getIdade() > 18 && li.getIdade() < 40)
                .sorted(comparing(Pessoa::getIdade).reversed())
                .collect(toList());
        
//        Optional<Pessoa> pessoaNova  = list.stream().max(comparing(Pessoa::getIdade));       
//        System.out.println("pessoa mais velha "+ pessoaNova.get().toString()); 
//        
        lista.forEach(ca -> {
            System.out.println(ca.toString() + "\n");
        });
        
        System.out.println("Depois de ordenar");
        lista = (List) lista.stream().sorted(comparing(Pessoa::getNome)).collect(toList());
        
        lista.forEach(ca -> {
            System.out.println(ca.toString() + "\n");
        });
        if (list.stream().anyMatch(li -> li.getCategoria().equals('B') )){
            System.out.println("algum é B");
        }else{
            System.out.println("nao sao");
        }
    
    }
}

