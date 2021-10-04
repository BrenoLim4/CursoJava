
package br.com.abc.javacore.classesAbstratas.classe;


public class vendedor extends Funcionario{
    private double totalVendas;
    {
        super.cargo = "vendedor";
    }
    public vendedor() {
    }

    public vendedor(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    public void aumetentoSalario() {
        super.salario = salario + (salario*0.15);
    } 
    @Override
    public void calculaSalario(){
    super.salario = salario + totalVendas;   
    }

    public double getTotalVendas(int numeroVendas) {
        return totalVendas = numeroVendas * 40;
    }

    public void setTotalVendas(int numeroVendas) {
        this.totalVendas = numeroVendas * 40;
    }
    
}
