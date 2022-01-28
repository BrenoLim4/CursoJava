package br.com.abc.javacore.manipulacaoHora.forEachMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class Lancamento {

    private Integer dias;
    private Date horas;
    private Integer sinal;

    public Lancamento(Integer dias, Date horas, Integer sinal) {
        this.dias = dias;
        this.horas = horas;
        this.sinal = sinal;
    }//5 dias 3 horas e 40 minutos

    public static List<Lancamento> getListLancamentos() {
      Lancamento l1 = new Lancamento(30, new Date(2020, 10, 22, 3, 44),  1),
                   l2 = new Lancamento(10, new Date(2020, 10, 22, 1, 13), -1),
                   l3 = new Lancamento(1,  new Date(2020, 10, 22, 4, 20), -1);
                  
        List<Lancamento> lanc = Arrays.asList(l1, l2, l3);
        return lanc;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Date getHoras() {
        return horas;
    }

    public void setHoras(Date horas) {
        this.horas = horas;
    }

    public Integer getSinal() {
        return sinal;
    }

    public void setSinal(Integer sinal) {
        this.sinal = sinal;
    }

}
