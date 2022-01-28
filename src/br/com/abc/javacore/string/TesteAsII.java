/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.javacore.string;

import static java.lang.System.out;
import java.util.regex.Pattern;

/**
 *
 * @author 99039833
 */
public class TesteAsII {
    public static void main(String[] args) {
//        String nome = "Eduardo Breno 342";
//        IntStream chars = nome.chars();
//        chars.forEach(let -> {
//            char c = (char) let;
//            System.out.println(String.valueOf(c));
//        });
    String hora = "44:59";
        System.out.println(hora.matches("[0-9]{2}:[0-5][0-9]"));
        hora = "gregFSr";
        System.out.println(hora.matches("[a-zA-Z]+"));
        hora = "455.com.FSDF";
        System.out.println(hora.matches("[0-9]{3}.com.[A-Z]{4}"));
    }
}
