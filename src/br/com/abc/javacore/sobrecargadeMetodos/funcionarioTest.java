
package br.com.abc.javacore.sobrecargadeMetodos;


public class funcionarioTest {
    public static void main(String[] args) {
        funcionario funcionario = new funcionario("Emanuel Rebouças","920.543.321-23",4569,"453.321.345.-43");
        funcionario funcionario2 = new funcionario();
        funcionario2.setNome("Breno lima");
        funcionario2.setSalario(3290);
        funcionario2.setCpf("620.654.234-43");
        funcionario.imprime();
        funcionario2.imprime();
    }
    
}
