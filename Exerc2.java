import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a operação desejada: ");
        char operacao = entrada.nextLine().charAt(0);

        System.out.print("Digite o primeiro número: ");
        float num1 = entrada.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = entrada.nextFloat();

        float resultado = float;

        switch (operacao){
            case '+': resultado = num1 + num2;   
            break;
            case '-': resultado = num1 - num2;
            break; 
            case '/': resultado = num1 / num2;
            break; 
            case '*': resultado = num1 * num2;
            break;
        }

        System.out.print("Seu resultado é: " + resultado);
    
    }

}
