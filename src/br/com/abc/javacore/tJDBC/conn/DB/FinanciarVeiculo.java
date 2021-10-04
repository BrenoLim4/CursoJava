
package br.com.abc.javacore.tJDBC.conn.DB;

import java.math.BigDecimal;
import java.util.Scanner;

public class FinanciarVeiculo {
    private Double taxaDeJuros;
    private BigDecimal valorTotal;
    private BigDecimal jurosTotal;
    private BigDecimal vlrVeiculo;
    Scanner sc = new Scanner(System.in);
    
    public void calculodoFinanciamento(double vlrEntrada, int parcelaEscolhida) {
        int index;
        Double[] valorTotalopc = new Double[parcelaEscolhida];
        Double[] jurosTotalopc = new Double [parcelaEscolhida];
        float juros; 
        double vlrFinanciado = vlrVeiculo.doubleValue() - vlrEntrada;
        System.out.println("");
        System.out.printf("Opcoes de parcelamento. Valor a financiar R$ %,.2f\n", vlrFinanciado);
    
    for (int qtdParcela = 1; qtdParcela <= parcelaEscolhida; qtdParcela++ ){
        
        juros = (float) (vlrFinanciado * taxaDeJuros * qtdParcela);// taxa de juros
        double VlrParcela = ((vlrFinanciado + juros)/qtdParcela);
        double vlrTotal = (qtdParcela * VlrParcela);
        jurosTotalopc[qtdParcela-1] = (vlrTotal - vlrFinanciado);
        valorTotalopc[qtdParcela-1] = (vlrTotal+vlrEntrada);        
        System.out.printf("[%d] - %d parcelas de R$ %,.2f valor total R$ %,.2f, total pago em juros R$ %,.2f\n",qtdParcela,qtdParcela,VlrParcela,valorTotalopc[qtdParcela-1],jurosTotalopc[qtdParcela-1]);
    }
    System.out.println("Qual opção de parcelamento? ");
    index = sc.nextInt()-1;
    valorTotal = new BigDecimal(valorTotalopc[index]);
    jurosTotal = new BigDecimal(jurosTotalopc[index]);
    
}
    public double calculaJuros(int banco){
        
        switch (banco){
            case 1:
                taxaDeJuros = 1.32/100;
                break;
            case 2:
                 taxaDeJuros = 1.38/100;
                break;
            case 3:
                taxaDeJuros = 1.40/100;
                break;
            case 4:
                taxaDeJuros = 1.55/100;
                break;
            case 5:
                taxaDeJuros = 1.62/100;
                break;
            default: 
                System.out.println("[ERRO!!!] Banco não reconhecido. ");
                break;  
    }
        return taxaDeJuros;
}
    public void preencherDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n"
                    + "Valor da Entrada: \n"
                    + "Quantidade de parcelas a financiar: \n"
                    + "Banco financiador: [1]-Caixa/[2]-Itaú/[3]-BB/[4]-Santander/[5]Bradesco");
            double vlrEntrada = sc.nextDouble();
            int qtdParcela = sc.nextInt();
            int banco = sc.nextInt();
            calculaJuros(banco);
            calculodoFinanciamento(vlrEntrada, qtdParcela);
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }


    public BigDecimal getJurosTotal() {
        return jurosTotal;
    }

    public BigDecimal getVlrVeiculo() {
        return vlrVeiculo;
    }

    public void setVlrVeiculo(BigDecimal vlrVeiculo) {
        this.vlrVeiculo = vlrVeiculo;
    }
    
}
