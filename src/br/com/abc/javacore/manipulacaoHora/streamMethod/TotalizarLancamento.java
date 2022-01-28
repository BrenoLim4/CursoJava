package br.com.abc.javacore.manipulacaoHora.streamMethod;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author User
 */
public class TotalizarLancamento {

    public static void main(String[] args) {

        List<Lancamento> lancamentos = Lancamento.getListLancamentos();
        LancamentosProfis mes = new LancamentosProfis();
        long nanoSecondsresult, nanoSecondsStart;

        System.out.println(mes);
        nanoSecondsStart = System.nanoTime();

        Map<Integer, Map<Integer, List<Lancamento>>> result;
        result = lancamentos.stream()
                .collect(groupingBy(Lancamento::getIdProfissional, groupingBy(Lancamento::getSinal, toList())));

        result.entrySet().forEach(next -> {
            next.getValue().entrySet().forEach(item -> {                
                
                mes.setAuxDias(item.getValue().stream()
                        .filter(lan -> lan.getSinal().equals(item.getKey()))
                        .mapToInt(Lancamento::getDias).sum());
                
                mes.setDias(Integer.signum(item.getKey()) == Lancamento.POSITIVO ? 
                        Integer.sum(mes.getAuxDias(), mes.getDias()) : mes.getDias() - mes.getAuxDias());
                
                mes.setSomaHora(item.getValue().stream()
                        .mapToInt(l1 -> l1.getHoras().getHours()).sum());
                
                mes.setSomaMin(item.getValue().stream()
                        .mapToInt(l1 -> l1.getHoras().getMinutes()).sum());
                
                mes.ajustarHora2(item.getKey());
            });
        });
        
        nanoSecondsresult = System.nanoTime() - nanoSecondsStart;
        System.out.println("tempo de execução em ns " + nanoSecondsresult);
        System.out.println(mes);
    }
}
