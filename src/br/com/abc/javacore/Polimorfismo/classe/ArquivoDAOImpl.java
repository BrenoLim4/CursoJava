
package br.com.abc.javacore.Polimorfismo.classe;

public class ArquivoDAOImpl implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados no arquivos");
    }
    
}
