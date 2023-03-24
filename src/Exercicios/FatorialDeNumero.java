package Exercicios;

import java.util.Scanner;

public class FatorialDeNumero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int val = entrada.nextInt();

        int res = calcFatorial(val);

        System.out.println("o fatorial de " + val + " : " + res);

    }

    public static int calcFatorial(int n){

        if(n == 0){
            return 1;
        }
        // 5.4.3.2.1 esse é o fatorial de 5 que dara = 120
        return n * calcFatorial(n - 1);
            // 5 * fatorial(4);
                //4 * fatorial(3);
                    //3 * fatorial(2);
                        //2 * fatorial(1);
                            //1 * fatorial(0);
                                // return 1
    }

}
