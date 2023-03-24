package Comandos_Instrucoes_java;

public class Conversao_De_Tipos_De_Dados {

    public static void main(String args[]) {

       /* int num1 = Integer.parseInt(args[0]); //metodo parse()
        int num2 = Integer.parseInt(args[1]);

        int res = num1 + num2;*/

        /*double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        double res = num1 + num2;*/

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        Integer res = num1 + num2;
        String msg = res.toString();
       // String msg = String.valueOf(res);//metodo valueOf()

        //int res = num1 + num2;
        //String msg = String.valueOf(res);

        System.out.println(msg);



    }
}
