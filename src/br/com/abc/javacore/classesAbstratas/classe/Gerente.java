
package br.com.abc.javacore.classesAbstratas.classe;

public class Gerente extends Funcionario{
    {
        super.cargo = "Gerente";
    }
    public Gerente() {
    }
    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    
    @Override
    public void calculaSalario(){
        super.salario = salario + (salario*0.2);
    }
    
}
