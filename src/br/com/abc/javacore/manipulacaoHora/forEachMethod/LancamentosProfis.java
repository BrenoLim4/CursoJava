/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.javacore.manipulacaoHora.forEachMethod;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author User
 */
public class LancamentosProfis {
    private Integer somaHora;
    private Integer somaMin;
    private Integer dias = 0;
    private final String nome = "Breno Lima";
    private Date horaPos = new Date(2021,0,2,0,0);
    private Date horaNeg = new Date(2021,0,2,0,0);
    private Date saldoHrs = new Date(2021,0,2,0,0);
    private final SimpleDateFormat formatar = new SimpleDateFormat("HH:mm");
    
    public LancamentosProfis(){
        
    }
    
    public void ajustarHora(Integer somaHora, Integer somaMin, Integer sinal){
        if(somaMin >= 60){
            this.somaHora += somaMin/60;
            this.somaMin = somaMin%60;
        }
        if(somaHora >= 8){
            if(sinal.equals(1)){
                this.dias += somaHora/8;
            }else{
                this.dias -= somaHora/8;
            }            
            this.somaHora = somaHora%8;
        }        
    }
    public void atualizarSaldoHoras(){
        int sldHrs = Math.abs(horaPos.getHours()-horaNeg.getHours());
        int sldMin = Math.abs(horaPos.getMinutes()-horaNeg.getMinutes());
        saldoHrs = new Date(0,0,0,sldHrs, sldMin);
    }
    
    @Override
    public String toString() {        
        return   "\nhoras positiva: "   + getHorasPos()
                +"\nhoras negativa: " + getHorasNeg()
                +"\nsaldo: "          + getSaldoHoras()
                +"\ndias: "           + dias;
    }
    
    public String getHorasPos(){
        return formatar.format(horaPos);
    }
    
    public String getHorasNeg(){
        return formatar.format(horaNeg);
    }
    
    public String getSaldoHoras(){
        return formatar.format(saldoHrs);
    }

    public Date getHoraPos() {
        return horaPos;
    }

    public void setHoraPos(LocalTime horaPos) {
        this.horaPos = new Date(0,0,0,horaPos.getHour(), horaPos.getMinute());
    }

    public Date getHoraNeg() {
        return horaNeg;
    }

    public void setHoraNeg(LocalTime horaNeg) {
        this.horaNeg = new Date(0,0,0,horaNeg.getHour(), horaNeg.getMinute());
    }

    public String getNome() {
        return nome;
    }

    public Integer getSomaHora() {
        return somaHora;
    }

    public void setSomaHora(Integer somaHora) {
        this.somaHora = somaHora;
    }

    public Integer getSomaMin() {
        return somaMin;
    }

    public void setSomaMin(Integer somaMin) {
        this.somaMin = somaMin;
    }
    
    public Date getSaldoHrs() {        
        return saldoHrs;
    }

    public void setSaldoHrs(Date saldoHrs) {
        this.saldoHrs = saldoHrs;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
    
    
}
