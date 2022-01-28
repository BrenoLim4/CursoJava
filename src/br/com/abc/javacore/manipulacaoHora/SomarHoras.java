/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.javacore.manipulacaoHora;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javafx.util.converter.LocalTimeStringConverter;

/**
 *
 * @author User
 */
public class SomarHoras {
    static Integer somaMin;
    static Integer somaHora;
    static Integer dia = 1;
    public static void main(String[] args) {
        Date pos      = new Date(0, 0, 0, 4, 21);
        
        Date hora1    = new Date(0, 0, 0, 1, 21);
        Date hora2    = new Date(0, 0, 0, 20,21);
        
        LocalTime hora = LocalTime.of(hora1.getHours(), hora1.getMinutes());
        somaMin = Integer.sum(hora.getMinute(), hora2.getMinutes());
        somaHora = Integer.sum(hora.getHour(),hora2.getHours());
        ajustarHora(dia, somaHora, somaMin);
        
        hora = LocalTime.of(somaHora,somaMin);
        somaHora = Integer.sum(hora.getHour(),pos.getHours());
        somaMin  = Integer.sum(hora.getMinute(), pos.getMinutes());
        ajustarHora(dia,somaHora,somaMin);
        hora = LocalTime.of(somaHora,somaMin);
        
        pos = new Date(0,0,dia,hora.getHour(), hora.getMinute());
        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        System.out.println("dia(s): "+dia+" hora: "+format.format(pos));
        
    }
    private static void ajustarHora(Integer dia, Integer somaHora, Integer somaMin){
        if(somaMin >= 60){
            SomarHoras.somaHora += somaMin/60;
            SomarHoras.somaMin = somaMin%60;
        }
        if(somaHora >= 8){
            SomarHoras.dia += somaHora/8;
            SomarHoras.somaHora = somaHora%8;
        }
    }
}
