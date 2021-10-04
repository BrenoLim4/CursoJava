/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.javacore.stream;

import br.com.abc.javacore.Heranca.classe.Pessoa;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author User
 */
public class PessoaComparator implements Comparator<Pessoa> {

    private static final int ORDENAR_NOME = 1;
    private static final int ORDENAR_IDADE = 2;
    private static final int ORDENAR_CATEGORIA = 3;
    
    private final int ordenarPor;
    
    public PessoaComparator(Integer ordenarPor){
        this.ordenarPor = ordenarPor;
    }
    
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        switch(ordenarPor){
            case ORDENAR_NOME: return p1.getNome().compareToIgnoreCase(p2.getNome());
            case ORDENAR_IDADE: return p1.getIdade().compareTo(p2.getIdade());
            case ORDENAR_CATEGORIA: return p1.getCategoria().compareTo(p2.getCategoria());
            default: return 0;
                
        }
    }

    @Override
    public Comparator<Pessoa> reversed() {
        return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
    }

    public static int getORDENAR_NOME() {
        return ORDENAR_NOME;
    }

    public static int getORDENAR_IDADE() {
        return ORDENAR_IDADE;
    }

    public static int getORDENAR_CATEGORIA() {
        return ORDENAR_CATEGORIA;
    }

    public int getOrdenarPor() {
        return ordenarPor;
    }
    
}
