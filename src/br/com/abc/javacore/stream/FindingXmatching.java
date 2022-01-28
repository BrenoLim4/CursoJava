package br.com.abc.javacore.stream;

import br.com.abc.javacore.Heranca.classe.Pessoa;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 *
 * @author 99039833
 */
public class FindingXmatching {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.getList();
        // System.out.println(pessoas);
        pessoas.parallelStream()
                .filter(li -> li.getSalario().floatValue() < 2000)
                .forEach(li -> System.out.println("nome: " + li.getNome() + " salario: " + li.getSalario()));

        double soma = pessoas.stream()
                .filter(li -> li.getIdade() > 18)
                .mapToDouble(Pessoa::getSalario)
                .reduce(Double::sum).orElse(Double.MIN_VALUE);

        Pessoa p1 = new Pessoa("fffff", "546.543", 59, 'B', 2000d, "Auxiliar tecnico");

        IntSummaryStatistics est = pessoas.stream()
                .mapToInt(Pessoa::getIdade)
                .summaryStatistics();

        System.out.println(est.toString());

        est.combine(
                pessoas.stream()
                        .mapToInt(Pessoa::getIdade)
                        .summaryStatistics()
        );
        
        int aux = pessoas.stream()
                .mapToInt(Pessoa::getIdade)                
                .reduce(0, (x1, x2) -> x1 + x2 );
        
        System.out.println("int aux: " + aux);
            
        pessoas.stream()
                .mapToInt(Pessoa::getIdade)
                .forEach((e) -> {
                    Integer.sum(e, 3);
                });

        //  est.accept(p1.getIdade());
        System.out.println(est.toString());
    }
}
