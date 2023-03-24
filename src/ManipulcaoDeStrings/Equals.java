package ManipulcaoDeStrings;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        //-------------------------------------------------------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro nome: ");
        String nome1 = entrada.nextLine();

        System.out.print("Digite o primeiro nome: ");
        String nome2 = entrada.nextLine();

       /* if (nome1.equals(nome2)){ //metodo equals() tem mesma serventia que "=="
            System.out.println("Os nomes são iguais");
        }else{
            System.out.println("Os nomes são diferentes");
        }*/

        if (nome1.equalsIgnoreCase(nome2)){             //metodo equalsIgnoreCase() tem mesma serventia que "=="
                                                        // e conseguimos que uma String case sensitive não tenha importancia
                                                        //fazendo assim que deixe os nomes iguais
            System.out.println("Os nomes são iguais");
        }else {
            System.out.println("Os nomes são diferentes");


        }

        //-------------------------------------------------------------------------------------------------------------------------



    }

}
