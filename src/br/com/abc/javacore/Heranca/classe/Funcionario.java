package br.com.abc.javacore.Heranca.classe;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario() {
    }
    
    @Override
    public String toString(){
        return   "Nome: "     +super.nome
                +"\nCpf: "    +super.cpf
                +"\nRua: "    +super.endereco.getRua()
                +"\nBairro: " +super.endereco.getBairro()
                +"\nSalario: "+this.salario;
                
    }
   /* public void print() {
        super.print();
        System.out.println("Salario: R$ " + this.salario);
        imprimeReciboPagamento();
    }
   */
        public void imprimeReciboPagamento() {

        System.out.println("Eu "+this.nome+" recebi o pagamento de R$"+this.salario);
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
