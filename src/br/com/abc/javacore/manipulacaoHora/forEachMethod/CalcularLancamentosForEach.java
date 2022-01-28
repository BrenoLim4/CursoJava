package br.com.abc.javacore.manipulacaoHora.forEachMethod;

import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author User
 */
public class CalcularLancamentosForEach {

    public static void main(String[] args) {
        
        List<Lancamento> lancamentos = Lancamento.getListLancamentos();
        LancamentosProfis mes = new LancamentosProfis();
        long nanoSecondsresult, nanoSecondsStart;
        System.out.println(mes);
        nanoSecondsStart = System.nanoTime();
        
        lancamentos.stream().forEach(next -> {
            if(next.getSinal() == 1){
                mes.setSomaHora(Integer.sum(mes.getHoraPos().getHours(), next.getHoras().getHours()));
                mes.setSomaMin(Integer.sum(mes.getHoraPos().getMinutes(), next.getHoras().getMinutes()));
                mes.ajustarHora(mes.getSomaHora(), mes.getSomaMin(), 1);
                mes.setDias(Integer.sum(mes.getDias(), next.getDias()));
                mes.setHoraPos(LocalTime.of(mes.getSomaHora(),mes.getSomaMin()));                
            }else{
                mes.setSomaHora(Integer.sum(mes.getHoraNeg().getHours(), next.getHoras().getHours()));
                mes.setSomaMin(Integer.sum(mes.getHoraNeg().getMinutes(), next.getHoras().getMinutes()));
                mes.ajustarHora(mes.getSomaHora(), mes.getSomaMin(), -1);
                mes.setDias(mes.getDias() - next.getDias());
                mes.setHoraNeg(LocalTime.of(mes.getSomaHora(),mes.getSomaMin()));
            }
            mes.atualizarSaldoHoras();
        });
        nanoSecondsresult = System.nanoTime() - nanoSecondsStart;
        System.out.println("tempo de execução em ns "+nanoSecondsresult);
        System.out.println();
        System.out.println(mes);
    }
}
