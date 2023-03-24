package Comandos_Instrucoes_java;

import java.util.Random;

public class Aleatorio_Random {
    public static void main(String[] args) {
        Random rnd = new Random();

        int num1 = rnd.nextInt(6) + 1;//quando delimitar um numero dentro do nextInt sera delimitado que só podera escolher um numero até o definido, exemplo nextInt(10),   System.out.println(num)
        long num2 = rnd.nextLong();
        double num3 = rnd.nextDouble();
        float num4 = rnd.nextFloat();
        boolean num5 = rnd.nextBoolean();


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        //result exemplo aleatorio: 6

    }




}
