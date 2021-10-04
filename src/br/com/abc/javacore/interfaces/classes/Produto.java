
package br.com.abc.javacore.interfaces.classes;


public class Produto implements Tributavel, Transportavel{
    private String nome;
    private double peso;
    private double preco;
    protected double precoFinal;
    protected double valorFrete;
    protected double valorImposto;
    
    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }
    
    @Override
    public void calculaImposto() {
        precoFinal = this.preco + (this.preco * IMPOSTO);        
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    
    public void calculaFrete() {
        this.valorFrete = this.preco / peso * 0.1;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void valorImposto(){
        this.valorImposto = precoFinal - (preco + valorFrete);
    }
    @Override
    public String toString() {
        return "Produto: " + nome
               +"\npeso: " + peso + "kg"
               +"\npreco: " + preco
               +"\nValor do frete: " + valorFrete
               +"\npreco final: " + precoFinal
               +"\nvalor imposto: " + valorImposto;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getValorImposto() {
        return valorImposto = this.precoFinal-(this.preco+this.valorFrete) ;
    }
    
    public static double getIMPOSTO() {
        return IMPOSTO;
    }
    
    
}
