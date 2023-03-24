package Comandos_Instrucoes_java;

public class Arrays_Bidimensionais_Matrizes {
    public static void main(String[] args) {

       // int matriz[][] = new int [2][3];   // --->   Funciona semelhante a declaração de vetores
                                           // mas para declaras que é uma matriz e não um vetor abrimos 2 colchetes "[][]",
       // matriz[0][0] = 1;                  //por isso ele é bidimensional, um colchete para linhas e outro para colunas
       // matriz[0][1] = 2;
       // matriz[0][2] = 3;
       // matriz[1][0] = 4;
       // matriz[1][1] = 5;
       // matriz[1][2] = 6; //Coluna com endereçamento

       // System.out.println(matriz[1][2]);

        int matriz[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(matriz[i][j]);
            }
        }

    }

}
