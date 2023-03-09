package Exercicios;

import java.util.Scanner;

public class Meses {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o mês: ");
        String mes =  entrada.nextLine();

        /*switch (mes){
            case "Janeiro":
                System.out.println(mes + " tem 31 dias");
                break;
            case "Fevereiro":
                System.out.println(mes + " tem 28 dias");
                break;
            case "Março":
                System.out.println(mes + " tem 31 dias");
                break;
            case "Abril":
                System.out.println(mes + " tem 30 dias");
                break;
            case "Maio":
                System.out.println(mes + " tem 31 dias");
                break;
            case "Junho":
                System.out.println(mes + " tem 30 dias");
                break;
            case "Julho":
                System.out.println(mes + " tem 31 dias");
                break;
            case "Agosto":
                System.out.println(mes + " tem 31 dias");
                break;
            case "Setembro":
                System.out.println(mes + " tem 30 dias");
                break;
            case "Outubro":
                System.out.println(mes + " tem 31 dias");
                break;
            case "Novembro":
                System.out.println(mes + " tem 30 dias");
                break;
            case "Dezembro":
                System.out.println(mes + " tem 31 dias");
                break;
        }*/ //uma boa pratica é quanto menor seu codigo e mais legivel, melhor ele sera


        switch (mes){

            case "Janeiro":
            case "Março":
            case "Maio":
            case "Julho":
            case "Agosto":
            case "Outubro":
            case "Dezembro":
                System.out.println(mes + " possui 31 dias");
                break;
            case "Fevereiro":
                System.out.println(mes + " Possui entre 28 e 29 dias");
                break;
            case "Abril":
            case "Junho":
            case "Setembro":
            case "Novembro":
                System.out.println(mes + " Possui 30 dias");
                break;

        }

    }
}
