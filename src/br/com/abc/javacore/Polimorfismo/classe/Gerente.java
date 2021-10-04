
package br.com.abc.javacore.Polimorfismo.classe;


public class Gerente extends Funcionario {
    protected double pnl;
    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }
    @Override
    public void calcularPagamento(){
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    this.salario = this.salario + this.pnl;
    }
    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }

    
    
}
