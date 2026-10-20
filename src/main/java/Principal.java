
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int anterior = 0;
        int atual = 1;
        int proximo;

        System.out.println("Qual o termo você deseja: ");
        n = entrada.nextInt();

        if (n == 1) {
            atual = 0;
            System.out.println("O termo é :" + atual);
        } else {
            int i = 2;
            while (i < n) {

                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
                i = i + 1;
            }
            //0, 1, 1, 2, 3, 5, 8, 13, ...
            System.out.println("O termo é:" + atual);
        }
        entrada.close();
    }
}
