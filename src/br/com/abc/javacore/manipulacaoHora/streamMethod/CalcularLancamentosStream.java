package br.com.abc.javacore.manipulacaoHora.streamMethod;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author User
 */
public class CalcularLancamentosStream {

    public static void main(String[] args) {
        List<Lancamento> lancamentos = Lancamento.getListLancamentos(),
                lancamentosPos, lancamentosNeg;
        LancamentosProfis mes = new LancamentosProfis();
        long nanoSecondsresult, nanoSecondsStart;
        int somaHorasPos, somaMinutosPos, somaHorasNeg, somaMinutosNeg, diasPos, diasNeg;
        System.out.println(mes);

        nanoSecondsStart = System.nanoTime();

        lancamentosPos = lancamentos.stream()
                .filter(item -> item.getSinal().equals(1))
                .collect(toList());
        
        lancamentosNeg = lancamentos.stream()
                    .filter(item -> item.getSinal().equals(-1))
                    .collect(toList());
        
            somaHorasPos = lancamentosPos.stream()
                    .mapToInt(lan -> lan.getHoras().getHours()).sum();
            somaMinutosPos = lancamentosPos.stream()
                    .mapToInt(lan -> lan.getHoras().getMinutes()).sum();
            diasPos = lancamentosPos.stream()
                    .mapToInt(Lancamento::getDias).sum();
            diasNeg = lancamentosNeg.stream()
                    .mapToInt(Lancamento::getDias).sum();
            somaHorasNeg = lancamentosNeg.stream()
                    .mapToInt(lan -> lan.getHoras().getHours()).sum();
            somaMinutosNeg = lancamentosNeg.stream()
                    .mapToInt(lan -> lan.getHoras().getMinutes()).sum();
            mes.ajustarHora(somaHorasPos, somaMinutosPos, Lancamento.POSITIVO, diasPos);
            mes.ajustarHora(somaHorasNeg, somaMinutosNeg, Lancamento.NEGATIVO, diasNeg);

            nanoSecondsresult = System.nanoTime() - nanoSecondsStart;
            System.out.println("tempo de execução em ns " + nanoSecondsresult);
            System.out.println(mes);
        }
    }
