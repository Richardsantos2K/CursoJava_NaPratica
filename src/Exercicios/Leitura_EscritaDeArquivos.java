package Exercicios;

//import java.util.Scanner;
import java.io.*;
//import java.io.FileReader; // Prepara o arquivo para leitura
//import java.io.BufferedReader; // Cria o Buffer para leitura


public class Leitura_EscritaDeArquivos {

    public static void main(String[] args) throws IOException { //Apos o comando "throws IOException", estamos dizendo para ele descartar os erros que podem acontecer, para que não atrapalhe a execussão do programa
        /*FileWriter file = new FileWriter("Teste.txt");//preparamos um arquivo para escrita
        BufferedWriter buffer = new BufferedWriter(file);//passamos este arquivo como parametro para o buffer para que o buffer possa gravar neste arquivo

        buffer.append("Este é um arquivo de texte.");//append é um metodo de gravação de string
        buffer.append("Esta é outra linha adicionada.");
        buffer.close();//isso finalisara ou fechara o arquivo esta sendo gravado
        file.close();//fechamos o arquivo*/

        FileReader file = new FileReader("teste.txt");
        BufferedReader buffer = new BufferedReader(file);

        String conteudo = "";

        conteudo = buffer.readLine();

        System.out.println(conteudo);

        buffer.close();
        file.close();
    }
}
