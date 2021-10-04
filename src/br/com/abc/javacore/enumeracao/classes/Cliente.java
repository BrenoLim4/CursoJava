
package br.com.abc.javacore.enumeracao.classes;

public class Cliente {
    public enum TipoPagamento {
        Avista, Aprazo
    }
    private String nome;
    private final TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "\nnome: " + nome 
                + "\ntipo: " + tipoCliente.getNome()
                + "\ntipoPagamento: " + tipoPagamento 
                + "\nnumero: " + tipoCliente.getTipo()
                + "\nID do cliente: " + tipoCliente.getid();
                }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipoCliente;
    }
      
}
