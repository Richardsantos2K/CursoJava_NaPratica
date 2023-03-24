package Comandos_Instrucoes_java;

public class ForEach_Ou_ForEnhanced {
    public static void main(String[] args) {

        String vetor[] = {
                "Gabriel",
                "Danny",
                "Arthur"
        };

        for(int i = 0; i < 3; i++){
            System.out.println(vetor[i]);
        }

        System.out.println();

        for (String elemento : vetor){
            System.out.println(elemento);
        }

    }
}
