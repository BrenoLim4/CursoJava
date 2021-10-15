/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.javacore.stream;

import br.com.abc.javacore.Heranca.classe.Endereco;
import br.com.abc.javacore.Heranca.classe.Pessoa;
import br.com.abc.javacore.Polimorfismo.classe.Funcionario;
import com.sun.media.jfxmedia.logging.Logger;
import java.text.Format;
import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author 99039833
 */
public class CollectorsTeste {
    private static Map<String, Map<String, Map<String, Double>>> mapa = new TreeMap();
    private static Map<String, Map<String, Double>> map2 = new TreeMap();
    private static Map<String, Double> map3 = new TreeMap();  
    
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="lista">
        List<Pessoa> list = new ArrayList<>();
        Endereco endereco = new Endereco("Rua das flores", "Siqueira");
        Endereco endereco1 = new Endereco("Rua da paixao", "Barroso");
        Endereco endereco2 = new Endereco("Buraco da gia", "Messejana");

        Pessoa pessoa1 = new Pessoa("Breno", "629.543", 17, 'B', 2000d, "Auxiliar Administrativo");
        pessoa1.setEndereco(endereco);
        Pessoa pessoa2 = new Pessoa("Elma", "629.564", 40, 'A', 1000d, "Gerente");
        pessoa2.setEndereco(endereco1);
        Pessoa pessoa3 = new Pessoa("Ezson", "867.876", 30, 'B', 2300d, "Diretor");
        pessoa3.setEndereco(endereco2);
        Pessoa pessoa4 = new Pessoa("Eduarda", "324.476", 12, 'C', 4000d, "Arquiteto");
        pessoa4.setEndereco(endereco);
        Pessoa pessoa5 = new Pessoa("Emerson", "867.453", 18, 'B', 2500d, "Engenheiro");
        pessoa5.setEndereco(endereco1);
        Pessoa pessoa6 = new Pessoa("Thaina", "234.535", 55, 'A', 700d, "Contador");
        pessoa6.setEndereco(endereco2);
        Pessoa pessoa7 = new Pessoa("Carlos Benevides", "196.155", 80, 'D', 7000d, "Arquiteto");
        pessoa7.setEndereco(endereco);
        Pessoa pessoa8 = new Pessoa("Francisco Monteiro", "156.665", 25, 'D', 540d, "Contador");
        pessoa8.setEndereco(endereco1);
        Pessoa pessoa9 = new Pessoa("Gabriel", "515.685", 36, 'C', 6540d, "Engenheiro");
        pessoa9.setEndereco(endereco2);
        Pessoa pessoa10 = new Pessoa("Antonia", "561.465", 42, 'A', 5320d, "Auxiliar Administrativo");
        pessoa10.setEndereco(endereco);
        list.add(pessoa1);
        list.add(pessoa2);
        list.add(pessoa3);
        list.add(pessoa4);
        list.add(pessoa5);
        list.add(pessoa6);
        list.add(pessoa7);
        list.add(pessoa8);
        list.add(pessoa9);
        list.add(pessoa10);
//</editor-fold>

        Map<String, Double> nomesXsalario = list.stream().filter(var -> var.getSalario() > 1000)
                .collect(toMap(var1 -> {
                    return var1.getNome();
                }, var2 -> {
                    return var2.getSalario();
                }));
//        nomesXsalario.entrySet().forEach((values) -> {
//            System.out.println(values.getKey() + ": R$ " + values.getValue());
//        });

        Map<String, Long> qtdFunBairro = list.stream()
                .collect(groupingBy(var -> {
                    return var.getEndereco().getBairro();
                }, counting()));

        qtdFunBairro.entrySet().forEach((values) -> {
            System.out.println("Bairro: " + values.getKey()
                    + "\nQtd Funcionários: " + values.getValue());
        });

        Map<String, Double> mediaXbairro = list.stream()
                .collect(groupingBy(var -> {
                    return var.getEndereco().getBairro();
                }, averagingDouble(Pessoa::getSalario)));

//        mediaXbairro.entrySet().forEach((values) -> {
//            System.out.printf("\nBairro: %s"
//                    + "\nMedia por bairro: R$ %.2f", values.getKey(), values.getValue());
//        });
//            System.out.println("teste map");
//            Map<String, Map<String, Map<String, Double>>> map1 = new TreeMap();
//            Map<String, Map<String, Double>> map2 = new TreeMap();
//            Map<String, Double> map3 = new TreeMap();
//            map3.put("Breno", 1200D);
//            map2.put("Medico", map3);
//            map1.put("Siqueira", map2);
//            
//            map1.entrySet().forEach(m1 -> {
//                System.out.println("Bairro: "+ m1.getKey());
//                m1.getValue().entrySet().forEach(m2 -> {
//                    System.out.println("Cargo: " + m2.getKey());
//                    m2.getValue().entrySet().forEach(m3 -> {
//                        System.out.println("Funcionario: "+ m3.getKey()
//                        + "; salario = R$ " + m3.getValue());
//                    });
//                });
//            });
         
        Map<String, Double> 
            medSalCargo = list.stream()
                    .collect(groupingBy(Pessoa::getCargo,averagingDouble(Pessoa::getSalario)));
        
//        Map<String, List<String>> pesPorCargo = list.stream().collect(groupingBy(Pessoa::getCargo, mapping(Pessoa::getNome)));
//        
//            medSalCargo.entrySet().forEach(p -> { 
//                System.out.println("\ncargo: "+p.getKey().toUpperCase());                
//                    System.out.println("Media Salario cargo: "+p.getValue());
//                    pesPorCargo.entrySet().forEach(la -> {
//                        la.getValue().forEach(var -> {
//                            System.out.println("funcionarios\n" + var);
//                        });
//                    });
//            
//            });
        

 
    }
    public static void setMap (Map<String, Map<String, Map<String, Double>>> mapa){
        CollectorsTeste.mapa = mapa;
    }
    
    public static void setMap2 (Map<String, Map<String, Double>> map2 ){
        CollectorsTeste.map2 = map2;
    }
    
    public static Map<String, Map<String, Map<String, Double>>> getMapa(){
        return mapa;
    }
    
    public static Map<String, Map<String, Double>> getMap2 (){
        return map2;
    }
    
    public static void setMap3(Map<String, Double> map3){
        CollectorsTeste.map3 = map3;
    }
    
    public static Map<String, Double> getMap3(){
        return map3;
    }
}
