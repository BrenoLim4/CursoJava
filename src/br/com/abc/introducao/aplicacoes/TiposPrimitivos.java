
package br.com.abc.introducao.aplicacoes;

import java.util.Scanner;

public class TiposPrimitivos {

    
    public static void main(String[] args) {
        
        
      Scanner no = new Scanner (System.in);
        String nome;
        System.out.print("Digite o nome do aluno: ");
        nome = no.nextLine();
        System.out.printf("Digite as nota abaixo.\nAv1: ");
        Scanner sc = new Scanner(System.in);
        int av1 = sc.nextInt();
        System.out.print("Av2: ");
        Scanner sf = new Scanner(System.in);
        int av2 = sf.nextInt();
        System.out.print("Av3: ");
        Scanner sn = new Scanner(System.in);
        int av3 = sn.nextInt();
        
        float media = (av1 + av2 + av3) /3f;//*Calculo da media.*
        
        if(media>10 || media < 0){
            System.out.println("[ERRO!!!] Verifique os dados e tente novamente."); 
        }   else if(media>=6){
                System.out.printf("Média %.2f. O aluno %s foi aprovado!\n", media, nome);
                
            }   else{
                System.out.printf("Média %.2f. O aluno %s, foi reprovado!\n", media, nome);
                
                }
        
       
      } 
}
