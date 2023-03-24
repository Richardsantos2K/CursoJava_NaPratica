package Comandos_Instrucoes_java;

public class Recursividade {
    public static void main(String[] args) {
        /*for(int i = 0; i < 5; i++){
            Mostrar(i);*/
        Mostrar(0);
    }

    public static void Mostrar(int x){
        //System.out.println(x);
        if(x < 5){
            System.out.println(x);
            Mostrar(x + 1);
        }

    }

}
