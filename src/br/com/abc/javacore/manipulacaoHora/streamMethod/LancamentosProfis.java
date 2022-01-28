/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.javacore.manipulacaoHora.streamMethod;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author User
 */
public class LancamentosProfis {
    private int somaHora = 0;
    private int somaMin = 0;
    private int dias = 0;
    private int auxDias;
    private LocalTime horasPos;
    private LocalTime horasNeg;    
    private final String nome = "Breno Lima";
    private Date horaPos = new Date(2021,0,2,0,0);
    private Date horaNeg = new Date(2021,0,2,0,0);
    private Date saldoHrs = new Date(2021,0,2,0,0);
    private final SimpleDateFormat formatar = new SimpleDateFormat("HH:mm");
    
    public LancamentosProfis(){
        
    }
    
    public void ajustarHora2(Integer sinal){        
        if(this.somaMin >= 60){
            this.somaHora += somaMin/60;
            this.somaMin = somaMin%60;
        }
        if(this.somaHora >= 8){
            if(sinal == Lancamento.POSITIVO){
                this.dias += this.somaHora/8;
            }else{
                this.dias -= this.somaHora/8;
            }            
            this.somaHora = this.somaHora%8;
        } 
        if(sinal.equals(Lancamento.POSITIVO)){
            horasPos = LocalTime.of(this.somaHora, this.somaMin);
        }else{
            horasNeg = LocalTime.of(this.somaHora, this.somaMin);
        }
        atualizarSaldoHoras();
    }
    
    public void ajustarHora(int somaHora, int somaMin, int sinal, int dias){
        this.somaHora = somaHora;
        this.somaMin = somaMin;
        if(this.somaMin >= 60){
            this.somaHora += somaMin/60;
            this.somaMin = somaMin%60;
        }
        if(this.somaHora >= 8){
            if(sinal == Lancamento.POSITIVO){
                this.dias += this.somaHora/8;
            }else{
                this.dias -= this.somaHora/8;
            }            
            this.somaHora = this.somaHora%8;
        } 
        if(sinal == Lancamento.POSITIVO){
            setHoraPos(LocalTime.of(this.somaHora, this.somaMin));
            this.dias+= dias;
        }else{ 
            this.dias-= dias;            
            setHoraNeg(LocalTime.of(this.somaHora, this.somaMin));
        }
        atualizarSaldoHoras();
    }
    /*
        * quando o saldo horas for negativo e o dia for positivo, eu supro o defcit de horas, com o saldo de dias
        * se sldMin for negativo e o sldHora for positivo então sldMin += 60 min ao sld
        */
        //fazer: quando o saldo horas for negativo e o dia for positivo, eu supro o defcit de horas, com o saldo de dias
    private void atualizarSaldoHoras(){
        int sldHrs = Math.abs(horasPos.getHour()-horasNeg.getHour());
        int sldMin = Math.abs(horasPos.getMinute()-horasNeg.getMinute());
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

    public int getAuxDias() {
        return auxDias;
    }

    public void setAuxDias(int auxDias) {
        this.auxDias = auxDias;
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

    public int getSomaHora() {
        return somaHora;
    }

    public void setSomaHora(int somaHora) {
        this.somaHora = somaHora;
    }

    public int getSomaMin() {
        return somaMin;
    }

    public void setSomaMin(int somaMin) {
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

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    
}
