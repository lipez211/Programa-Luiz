import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = batata.nextInt();

        long fatorial = 1;
        for (int i = 1; i <= numero; i++){
            fatorial = fatorial * i;
            System.out.println("o fatorial de " + numero + " é " + fatorial);
        }
    }
}
