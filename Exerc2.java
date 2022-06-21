import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);

        System.out.print("Digite um número entre 0 e 100: ");
        int numero = batata.nextInt();

        int resultado = numero % 2;

        if (numero > 100 && numero < 0){
            System.out.println("Você passou do limite!!");
        }
        if (resultado == 0){
            System.out.println("Número par");
        }else if (resultado != 0){
            System.out.println("Número ímpar");
        }

    }
}
