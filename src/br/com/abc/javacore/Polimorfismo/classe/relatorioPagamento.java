
package br.com.abc.javacore.Polimorfismo.classe;




public class relatorioPagamento {
   
    public void relatorioPagamentoGenerico(Funcionario funcionario){
            System.out.println("Gerando relatorio de pagagamento");
            funcionario.calcularPagamento();
            System.out.println("nome: " + funcionario.getNome());
            System.out.println("salario: " + funcionario.getSalario());
            if(funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario;
            System.out.println("participacao nos lucros: "+ g.getPnl());
            }
              if(funcionario instanceof Vendedor) {
                Vendedor v = (Vendedor) funcionario;
                System.out.println("Total em vendas: " + v.getTotalVendas());
                System.out.println("Horas mensais: " + v.getHorasMensal());
                System.out.println("Horas semanais: " + v.getHorasSemanal()); 
              }
            
            
    }
    
}
