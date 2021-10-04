
package br.com.abc.javacore.Exceptions.RumTimeException;

public class RunTimeException {
    public static void main(String[] args) {
        try{
            divisao(20,0);
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    public static void divisao(int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
        }
        int result = num1/num2;
        System.out.println(result);
    }
}
 