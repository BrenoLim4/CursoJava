
package br.com.abc.javacore.modificadoresEstatico.classes;


public class Cliente {
    /* passo a passo pra criar um objeto.
    *1 - Bloco de inicialização static é executado quando a JVM carregar a classe (é executado apenas 1 vez);
    *2 - Alocado o espaço na memoria para o objeto que sera criado.
    *3 - Cada atributo de classe é criado e iniializado com seus valores default(predefinidos) ou valores explicitos.
    *4 - Bloco de inicialização é executado;
    *5 - O onstructor é executado;
    */
    private static final int[] parcelas;
    static {//bloco de inicialização static e executado apenas uma vez.
        parcelas = new int[100];
      //  System.out.println("Dentro do bloco de inicializacao");
        for(int i=1; i<=100;i++){
            parcelas[i-1] = i;
        }
    }
    public Cliente(){
        
    }
    public static int[] getParcelas(){
        return parcelas;
    }
    
}
