
package br.com.abc.javacore.blocodeInicializacao.classes;


public class Cliente {
    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao");
        for(int i=1; i<=100;i++){
            parcelas[i-1] = i;
        }
    }
    public Cliente(){
        System.out.println("");
        for(int parcela : this.parcelas){
            System.out.print(parcela +" ");
        }
        
    }
    public int[] getParcelas(){
        return this.parcelas;
    }
    public void setParcelas(int[] parcelas){
        this.parcelas = parcelas;
    }
}
