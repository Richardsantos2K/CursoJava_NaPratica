package Exercicios;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeros[]  = new int[3];

        System.out.print("Digite um numero: ");
        int val = new Scanner(System.in).nextInt();

        System.out.println("Sequência de Fibonacci " + val + " Valores");



        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 0;

        // 0 1 1 2 3 5 8 13....

        for(int i = 0; i < val; i++){

            if (i < val -1){
                System.out.println(numeros[0] + ", ");
            }else{
                System.out.println(numeros[0]);
            }

            numeros[2] = numeros[0] + numeros [1];
            numeros[0] = numeros[1];
            numeros[1] = numeros[2];

        }

        if (val == 0 || val == 1){
            System.out.println("O numero faz parte da sequência de Fibonacci");
        } else if (val == numeros[2]) {
            System.out.println("O numero faz parte da sequência de Fibonacci");
        } else{
            System.out.println("O número digitado não faz parte da sequência de Fibonacci");
        }
    }
}
