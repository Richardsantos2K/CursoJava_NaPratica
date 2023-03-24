package Comandos_Instrucoes_java;

public class Arrays_Unidimencionais_Vetores {
    public static void main(String[] args) {

        int num = 5;

        int vetor[] = new int[5];

        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;

        System.out.println(vetor[2]);

       // vetor[2] = 45;
       // System.out.println(vetor[2]);

        //String vetor_[] = new String[5];

        //vetor_[0] = "Gabriel";
        //vetor_[1] = "Danny";
       // vetor_[2] = "Arthur";
       // vetor_[3] = "João";
       // vetor_[4] = "Bia";

       // System.out.println(vetor_[2]);

        String vetor_2[] = { //Forma simplificada de declarar vetores
               "Gabriel",
               "Danny",
               "Arthur"
        };

        int numeros[] = {
                10,
                20,
                30,
                40
        };

        System.out.println(numeros[3]);

        System.out.println(vetor_2[2]);



    }
}
