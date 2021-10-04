/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.javacore.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/**
 *
 * @author User
 */
public class MapTeste {

    public static void main(String[] args) {
        final Integer CHAVE_CARRO = 1;
        final Integer CHAVE_MOTO = 2;
        final Integer CHAVE_CAMINHÃO = 3;
        final Integer CHAVE_BICICLETA = 4;
        List<Map> listMap = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Carro");
        map.put(2, "Moto");
        map.put(3, "Caminhão");
        map.put(4, "bicicleta");
        listMap.add(map);
        map = new LinkedHashMap<>();
        map.put(1, "Carro");
        map.put(2, "E");
        map.put(3, "E");
        map.put(4, "bicicleta");
        listMap.add(map);
        
        Long qtd = listMap.stream().filter(li -> li.containsValue("E")).count();
        System.out.println("quantidade: " + qtd);
//        map.entrySet().forEach(entry -> {
//            if (Objects.equals(entry.getKey(), CHAVE_MOTO)) {
//                map.put(CHAVE_MOTO, "Hornet");
//            } else if (Objects.equals(entry.getKey(), CHAVE_CARRO)) {
//                map.put(CHAVE_CARRO, "Honda Civic");
//            }
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        });
        
    }

}
