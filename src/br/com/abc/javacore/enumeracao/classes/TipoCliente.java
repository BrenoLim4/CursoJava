package br.com.abc.javacore.enumeracao.classes;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica"), IMOVEIS(3, "imoveis"){
        public String getId(){
        return "B";    
        }
    };

    private final int tipo;
    private final String nome;
    
    TipoCliente(int tipo, String nome){
        this.tipo = tipo;
        this.nome = nome;
    }
    public String getid(){
    int a = this.getTipo();    
        switch (a) {
            case 1:
                return "342125";
            case 2:
                return "342254";
            default:
                return "345676";
        }
 } 
    public int getTipo(){
        return tipo;
    }
    public String getNome(){
        return nome;
    }
}
