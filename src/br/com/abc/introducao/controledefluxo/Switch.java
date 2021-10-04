package br.com.abc.introducao;


public class Switch {
    
    public static void main(String[] args) {
        
        byte dia = -128;
        String sem = "", d = "";
        switch (dia){
            
            case 1: case 7:
                sem = "final de semana!";                
                d = (dia == 1)? "domingo":"sabado";
                break;
            case 2 :case 3: case 4:case 5: case 6:
                sem = "dia util";
                d = "segunda";
                break;
            default:
                System.out.println("ERRO!");
                   
        }
        if (sem == "dia util"){
            System.out.printf("Hoje é %s, e voce vai ter que ir trabalhar.",d); 
        } else { 
            System.out.printf("Dia de %s, fim de semana, dia de curtir na praia.",d);
        }
    }
  
}
