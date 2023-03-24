package ManipulcaoDeStrings;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String original = "";
        String nova = "";
        int desde = 0;
        int ate = 0;
        System.out.print("Informe a String original: ");
        original = entrada.nextLine();

        System.out.print("Desde qual caractere obter a nova String: ");
        desde = entrada.nextInt();

        System.out.print("Até qual caractere obter a nova String: ");
        ate = entrada.nextInt();

        nova = original.substring(desde, ate);  //O método substring() retorna
                                                // a parte da string entre os índices inicial e final,
                                                // ou até o final da string.

        System.out.println("A nova String é : " + nova);

    }
}
