package Exercicios;

public class CalculadoraSimples {
    public static void main(String[] args) {

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);

        String operacao = args[1];

        double resultado = 0;

        switch (operacao){
            default:
                System.out.println("Operação invalida");
                break;

            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado da Adição " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado da Subtração " + resultado);
                break;
            case "x":
            case "X":
                resultado = num1 * num2;
                System.out.println("Resuldado da Multiplicação " + resultado);
                break;
            case "/":
            case ":":
                resultado = num1 / num2;
                if (num2 == 0){
                    System.out.println("Não é possivel dividir por zero.");
                }else{
                    System.out.println("Resultado da Divisão: " + resultado);
                }
                break;

        }


    }

}
