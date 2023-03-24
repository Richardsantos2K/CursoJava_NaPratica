package Exercicios;

public class TestePrimos{
    public static void main(String[] args) {
        int i;

        for(i = 1; i <= 100; i++) {
            if (ehPrimo(i)) {
                System.out.printf("%d\n", i);
            }
        }
    }

    public static boolean ehPrimo(int n){
        if ((n == 0) || (n == 1)) {
            return false;
        }else{
            int i, fim;

            fim = (int)Math.sqrt(n);
            for(i = 2; i <= fim; i++){
                if ((n % i) == 0){
                    return false;
                }

            }

        }


        return true;
    }

}
