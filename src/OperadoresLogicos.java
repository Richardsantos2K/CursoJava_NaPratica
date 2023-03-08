public class OperadoresLogicos {
    public static void main(String[]args){

        int num1 = 5 * 3;
        int num2 = 5 + 5;

        boolean res = num1 < num2 && num1 == 7;

        System.out.println(res);


        int num3 = 5 * 3;
        int num4 = 5 + 5;

        boolean resu = num3 <= num4 && num3 == 7;

        System.out.println(resu);

        //se o resultado da expressão é true por que ele ira retornar false ?
        //o resultado ira retornar false por que se umas das expressões forem false o && não deixara ser true, pois para ele retornar true as duas expressões precisam ser true


        int num5 = 5 * 3;
        int num6 = 5 + 5;

        boolean resul = (num5 < num6) && (num5 != 7);// pelas duas expressoes estarem verdadeiras retornara true

        System.out.println(resul);



        int num7 = 5 * 3;
        int num8 = 5 + 5;

        boolean result = num7 < num8 || num7 == 7;

        System.out.println(result);

        //o operador OR ou ||  ele ira retornar true se pelo menos umas das expressões forem true ou seja, se tiver um expressão true e outra false, ele retornara true
        //caso tenha duas expressões falsas, retornara false



    }
}
