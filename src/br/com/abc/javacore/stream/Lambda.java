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
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Lambda {

    //Descubrir quem ganha mais, a media, quem ganha menos;
    public static void main(String[] args) throws InstantiationException {
        List<Pessoa> list = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Breno", "629.543", 17, 'B', 2000d, "Auxiliar tecnico");
        Pessoa pessoa2 = new Pessoa("Elma", "629.543", 40, 'A', 1000d, "Medico");
        Pessoa pessoa3 = new Pessoa("Ezson", "867.876", 30, 'B', 1000d, "Bancario");
        Pessoa pessoa4 = new Pessoa("Eduarda", "324.476", 12, 'C', 4000d, "Engenheiro");
        Pessoa pessoa5 = new Pessoa("Emerson", "867.453", 18, 'B', 2500d, "engenheiro civil");
        Pessoa pessoa6 = new Pessoa("Thaina", "234.535", 55, 'A', 700d, "Motoboy");
        list.add(pessoa1);
        list.add(pessoa2);
        list.add(pessoa3);
        list.add(pessoa4);
        list.add(pessoa5);
        list.add(pessoa6);

        List<Integer> f = new ArrayList<>();

        Integer idade = Integer.valueOf(JOptionPane.showInputDialog("Digite uma idade"));
        String excluida = "";
        try {
            Map<String, String> mapa = list.stream().
                    filter(p -> p.getIdade() > idade)
                    .collect(toMap(Pessoa::getCpf, Pessoa::getNome, (value1, value2) -> {
                        return value1.concat(" " + value2);
                    }));
            mapa.entrySet().parallelStream().forEach(l -> {
//                JOptionPane.showMessageDialog(null, "Chave: " + l.getKey() 
//                        + "\nvalor: " + l.getValue());
                System.out.println("Chave: " + l.getKey());
                System.out.println("valor: " + l.getValue());
            });
        } catch (Exception ex) {
            //String msg = "Chave duplicada";
            Logger.getGlobal().log(Level.WARNING, ex.getMessage());
        }

        System.out.println(excluida);
        List<Integer> inteiros = new ArrayList<>();
        List<Integer> result = Stream.of(2, 3, 4, 6, 7)
                .filter(y -> Stream.of(2,4,7).anyMatch(pre -> pre.equals(y)))
                .peek(x -> {
                    list.get(0).setNome("Barnabé goncalves");
                    list.get(0).setIdade(100);
                    if(!list.get(0).getCpf().matches("(1-9){3}.(1-9){3}.(1-9){3}-(1-9){2}")){
                        System.out.println("Cpf inválido");
                    }
                })
                .map(x -> {
                    Optional<Integer> maisVelho = list
                            .stream()
                            .map(Pessoa::getIdade)
                            .max((f1, f2) -> f1.compareTo(f2));
                    return maisVelho.orElse(0) / x;
                }).collect(toList());

        JOptionPane.showMessageDialog(null, result);
        System.out.println(inteiros);
        System.out.println("Resultados : "+result);
        System.out.println(list.get(0));

//        list.forEach(ca -> {
//            System.out.println(ca.toString() + "\n");
//        });

        List<Pessoa> lista = list.stream()
                .sorted((f1, f2) -> {
                    int retorno;
                    retorno = f1.getIdade().compareTo(f2.getIdade());
                    if (retorno == 0) {
                        retorno = f1.getNome().compareTo(f2.getNome());
                    }
                    if (retorno == 0) {
                        retorno = f1.getCategoria().compareTo(f2.getCategoria());
                    }
                    return retorno;
                }).collect(toList());

        System.out.println("Depois de filtrar");

//        lista.forEach(ca -> {
//            System.out.println(ca.toString() + "\n");
//        });

        Optional<Pessoa> pessoaNova = list.stream().max(comparing(Pessoa::getIdade));
        System.out.println("pessoa mais velha " + pessoaNova.get().toString());
//        

        System.out.println("Depois de filtrar");
        lista = (List) lista.stream()
                .sorted()
                .collect(toList());

//        list.stream().filter(li -> li.getIdade() > 10)
//                .peek(e -> System.out.println("fdsf" + e));
        Long qtdFuncionario = list.stream().filter(li -> li.getIdade() <= 18).count();
        
        Double somaSalario = list.stream()
                .filter(li -> li.getIdade() <= 18)
                .parallel()
                .skip(2)
                .distinct()
                .mapToDouble(Pessoa::getSalario)
                .reduce(Double.MIN_VALUE, (x, y) -> Double.sum(x, y));

        

        Optional.of(somaSalario).orElse(Double.MIN_VALUE);
        //Stream.of(list).
        System.out.printf("Média salárial até 18 anos R$ %.2f\n", 
                (somaSalario == Double.MIN_VALUE ? Double.MIN_VALUE : somaSalario / qtdFuncionario));
//       
//            List<String> nrContratos = listaFaturasXParcelas.stream()
//                    .filter(fat -> fat.getFatura().getId() != null)
//                    .sorted(comparring(FaturasXParcelas::getFatura(), (f1, f2) -> f1.getContrato().getNrContratoDER().compareTo(f2.getContrato().getNrContratoDER())));
//                    .map((fat) -> {                        
//                        return fat.getFatura().getContrato().getNrContratoDER();
//                    }).collect(toList());
//       
//        list.stream().filter(li -> li.getTeste().equals(Boolean.FALSE)).forEach(li -> {
//            System.out.println(li.toString() + "\n");
//        });
//        if (list.stream().anyMatch(li -> li.getCategoria().equals('B') )){
//            System.out.println("algum é B");
//        }else{
//            System.out.println("nao sao");
//        }
//    }

    }
}
