
package br.com.abc.javacore.introducaoaMetododos;


public class professorTest {
    public static void main(String[] args) {
      professor prof = new professor();
      prof.nome = "Roberta Layla Sousa Silva";
      prof.cpf = "613.346.793.20";
      prof.matricula = "up202071";
      prof.Rg = "34.423.435.65";
      prof.nacionalidade = "Brasileiro";
      
      professor prof2 = new professor();
      prof2.nome = "Ilo Bueno";
      prof2.cpf = "324.765.426.54";
      prof2.matricula = "4e5f6a";
      prof2.Rg = "89.865.765.43";
      prof.nacionalidade =  "Argentino";
      
        
      prof.imprime();
      prof2.imprime();
        
    }
    
}
