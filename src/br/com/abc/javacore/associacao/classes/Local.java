package br.com.abc.javacore.associacao.classes;

public class Local {

    private String bairro;
    private String estado;

    public Local(String bairro, String estado) {
        this.bairro = bairro;
        this.estado = estado;
    }

    public Local() {

    }
    public void print(){
        System.out.println("-----------Relarorio do local---------");
        System.out.println("bairro: " + this.bairro);
        System.out.println("estado: " + this.estado);
    }
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
