package br.com.abc.javacore.introducaoaMetododos;


public class Calculadora {
    public void somaDoisNumeros(){
        int soma = 64+43+89;
        System.out.println(soma);
        
    }
    public void tabuada(int num){
        for(int i=1; i<=num; i++){
            for(int d=1; d<=10; d++){
                System.out.println(i+" x "+d+"= "+i*d);
            }
        }
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
        
    }
    public void areadoCirculo(float raio){
       double pi = 3.14;
       double area = pi*raio*raio;
        System.out.println("Area do circulo "+area+" metros");
    }
    public double areadoTriangulo(float base, float altura){
        return (base*altura)/2;
        
    }
    public double divideDoisNumeros(double num1, double num2){
        if(num2 != 0){
        return num1 / num2;
        }
        return 0;
    }
    public double imprimeDoisNumerosDivididos(double num1, double num2){
        if (num2 != 0){
         return (num1/num2);
  
        }
        System.out.println("Não é possível dividir por 0");
        return 0;
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 20;
        System.out.println("Dentro do metodo");
        System.out.println("num1: " +num1);
        System.out.println("num2: " +num2);
        
    }
    public void somaArray (int [] idade){
        int soma =0;
        for (int num : idade){
            soma+=num;
        }
        System.out.println(soma);
    }
    public void mediaVarArgs (int ... idade){
     int soma =0;
        for (int num : idade){
            soma+=num;
        }
        float media = soma/idade.length;
        System.out.println(media);
        
    }
}
