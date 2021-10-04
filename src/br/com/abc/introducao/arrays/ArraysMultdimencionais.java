package br.com.abc.introducao.arrays;


public class ArraysMultdimencionais {

    
    public static void main(String[] args) {
       //int [][] dias = new int[3][];
       //dias[0] = new int[2];
       //dias[1] = new int[]{1,2,3};
       //dias[2] = new int[4];
     String[][] nomes = {{"bia", "carminham", "claudia"},{"ana","Breno"},{"Roberta", "julio", "celio", "joao"}};
       for(String[] arr : nomes){
         for(String num : arr){
             System.out.println(num);
         }
     }
       
    }
 }
