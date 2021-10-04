package br.com.abc.introducao.aplicacoes;

import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        int qtdi = 0,SomaId = 0, idade, confirm;
        float MediaId;
        
        do{
            Scanner sc = new Scanner (System.in);
            System.out.println("Digite uma idade: ");
            idade = sc.nextInt();
            qtdi++;
            SomaId += idade;
            System.out.printf("Deseja informar uma outra idade?\n [sim=1 / nao=0]");
            confirm = sc.nextInt();
        }   while(confirm == 1);       
        MediaId = SomaId/qtdi;
        System.out.printf("Foram informadas %d, idades.\n Media das idades %.2f", qtdi, MediaId); 
    }
   
}
