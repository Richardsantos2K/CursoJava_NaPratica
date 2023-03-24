package Comandos_Instrucoes_java;

public class Metodos {
        public static void main(String[] args) { //Programa principal
            Somar();
            System.out.println();
            Soma(20, 15);
        }

        public static void Somar(){ //metodo que sera chamado dentro do programa principal
            int num1 = 10;
            int num2 = 2;

            int res = num1 + num2;
            System.out.println("A soma é: " + res);
        }

        public static void Soma(int n1, int n2){ //metodos com parametros
            int num3 = n1;
            int num4 = n2;
            int resu = num3 + num4;
            System.out.println("A soma é: " + resu);
        }


}
