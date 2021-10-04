
package br.com.abc.javacore.introducaoaMetododos;

public class CalculadoraTest{
    public static void main(String... args) {
        Calculadora calc = new Calculadora();
        //calc.tabuada(14);
        
        //calc.multiplicaDoisNumeros(50,120);
    /*calc.areadoCirculo(7);//valor do raio
    double area = calc.areadoTriangulo(10, 0);//base e altura
    double div = calc.divideDoisNumeros(20000, 100);
        if (div < 15){
            System.out.println(div+" é menor que 15");
        } else{
            System.out.println(div+" é maior que 15");
        }
    double aux = calc.imprimeDoisNumerosDivididos(div,area);
        System.out.printf("\n%.2f\n",aux);*/
        
        int[] idade = new int[10];
        for (int i=0; i<10; i++){
            idade[i] = i*2*4+1;
        }
               
        calc.somaArray(idade);
        calc.mediaVarArgs(idade);
    }
}
