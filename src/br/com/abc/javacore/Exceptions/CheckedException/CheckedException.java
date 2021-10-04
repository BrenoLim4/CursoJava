package br.com.abc.javacore.Exceptions.CheckedException;

import java.io.File;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {
        //criarArquivo();
        //ExcluirArquivo();
        //pegarCaminhoArq();
        try {
            Verificacao();
            //pegarCaminhoArq();

        } catch (IOException e) {
            e.printStackTrace();
           
            
        }

    }

    public static void criarArquivo() throws IOException {
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0: {
                    File file = new File("C:\\Users\\User\\Desktop\\Edificacoes.xml");

                    file.createNewFile();
                    System.out.println("Arquivo xml criado ");
                    System.out.println("Caminho do arquivo. " + file.getAbsolutePath());

                    break;
                }
                case 1: {
                    File file = new File("C:\\Users\\User\\Desktop\\Edificacoes.java");//C:\Users\User\Desktop

                    file.createNewFile();
                    System.out.printf("Arquivo java criado. \nCaminho do arquivo: %s", file.getAbsolutePath());

                    break;
                }
                case 2: {
                    File file = new File("C:\\Users\\User\\Desktop\\Edificacoes.exe");

                    file.createNewFile();
                    System.out.printf("Arquivo exe criado. \nDiretorio: %s", file.getAbsolutePath());

                    break;
                }
            }

        }
    }

    public static void ExcluirArquivo() {

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0: {
                    File file = new File("C:\\Users\\User\\Desktop\\Edificacoes.xml");
                    file.delete();
                    System.out.println("Arquivo xml excluido. ");

                    break;
                }
                case 1: {
                    File file = new File("C:\\Users\\User\\Desktop\\Edificacoes.java");
                    file.delete();
                    System.out.println("Arquivo java excluido");
                    break;
                }
                case 2: {
                    File file = new File("C:\\Users\\User\\Desktop\\Edificacoes.exe");
                    file.delete();
                    System.out.println("Arquivo exe excluido.");
                    break;
                }
            }

        }
    }

    public static void pegarCaminhoArq() throws IOException {
        File file = new File("C:\\Users\\User\\Desktop\\Edificacoes.xml");
        
            file.deleteOnExit();

       
    }

    public static void Verificacao() throws IOException {
        File file = new File("C:\\Users\\User\\Desktop\\Edificacoes.xml");
        file.exists();
        if (file.exists() == false) {
            criarArquivo();
        } else {
            ExcluirArquivo();
        }
    }

}
