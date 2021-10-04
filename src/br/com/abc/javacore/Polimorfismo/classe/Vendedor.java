
package br.com.abc.javacore.Polimorfismo.classe;


public class Vendedor extends Funcionario {
    private double totalVendas;
    private double horasTrabalhadas;
    private double horasSemanais;
    private double horasMensais;
    
    public Vendedor(String nome, double salario,double totalVendas, double horasTrabalhadas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    @Override
    public void calcularPagamento(){
        this.salario += totalVendas * 0.05;
    }
    
    public double getHorasMensal(){
        horasMensais = horasTrabalhadas * 22;
        return horasMensais;
    }
    public double getHorasSemanal(){
        horasSemanais = horasTrabalhadas * 7;
        return horasSemanais;
    }
            
    public void setHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    
    
}
