import java.util.Scanner;

public class Exerc1{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

            System.out.print("Digite qual operação deseja(*, /, +, -): ");
            char operacao = entrada.next().charAt(0);
         
            System.out.print("Digite um número: ");
            float num1 = entrada.nextFloat();

            System.out.print("Digite um número: ");
            float num2 = entrada.nextFloat();

            double result;

            switch (operacao) {

                case '+': result = num1 + num2;
                System.out.print(result);
                break;
                
                case '-': result = num1 + num2;
                System.out.print(result);
                break; 

                case '*': result = num1 * num2;
                System.out.println(result);
                break;

                case '/': result = num1 / num2;
                System.out.println(result);
                break;


            }
    }


}
