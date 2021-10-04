package br.com.abc.introducao;


import java.util.Scanner;


public class controledefluxo {
    public static void main(String[] args) {
        
        Scanner sal = new Scanner (System.in);
        System.out.print("Digite o seu salario: ");
        int salario = sal.nextInt();
        float imposto;
        if(salario < 1000 && salario > 0){
            imposto = (float)(salario*0.05); 
            System.out.printf("Você pagará R$ %.2f de imposto.\n", imposto); 
        }   else if(salario >= 1000 && salario < 2000){
                imposto = (float)(salario*0.1); 
                System.out.printf("Você pagará R$ %.2f de imposto.\n", imposto);   
            }   else if(salario >= 2000 && salario < 4000){
                    imposto = (float)(salario*0.15); 
                    System.out.printf("Você pagará R$ %.2f de imposto.\n", imposto);   
                }   else if(salario > 4000 && salario <5000) {
                        imposto = (float)(salario*0.17); 
                        System.out.printf("O valor pago em imposto é de R$ %.2f.\n", imposto);   
                    }   else if(salario > 5000){
                            imposto = (float)(salario*0.20); 
                            System.out.printf("O valor pago em imposto é de R$ %.2f.\n", imposto); 
                        }   else{
                                System.out.println("Digitando valor negativo ne Fdp.");
                            }
        
               
    }
}
