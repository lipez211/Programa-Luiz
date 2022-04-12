import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            
            System.out.print("Digite um número: ");
            float valor = entrada.nextFloat();

            float num;

            if (valor % 2 == 0){
                System.out.println("É par");

            }else if (valor % 2 != 0){
                System.out.println("É ímpar");}

    }
    
}
