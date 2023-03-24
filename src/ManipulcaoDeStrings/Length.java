package ManipulcaoDeStrings;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = entrada.nextLine();

        int numCaracteres = nome.length(); //length é comprimento de uma String ele ira informar quantas letras tem ou quantos caracteres

        System.out.println("O nome " + nome + " contem " + numCaracteres + " letras");

    }
}
