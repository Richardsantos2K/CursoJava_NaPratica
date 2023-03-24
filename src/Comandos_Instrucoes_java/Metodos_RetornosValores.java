package Comandos_Instrucoes_java;

public class Metodos_RetornosValores {
    public static void main(String[] args) {
        //int res = Somar(120, 25);

        int res = Somar(120, 25) - 30;

        System.out.println("A soma é: " + Somar(40, 45));

        System.out.println("A soma é: " + res);
    }

    public static int Somar(int n1, int n2){
        int num1 = n1;
        int num2 = n2;
        int res = num1 + num2;
        return res;
    }

}
