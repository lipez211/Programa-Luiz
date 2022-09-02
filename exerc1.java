import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner bota = new Scanner(System.in);

        System.out.println("1- Somar. ");
        System.out.println("2- Subtrair. ");
        System.out.println("3- Multiplicar. ");
        System.out.println("4- Divisão. ");
        System.out.println("5- Módulo da divisão. ");
        System.out.println("Digite qual operação deseja realizar: ");
        int op = bota.nextInt();

    

        switch (op) {
    
            case 1:
            System.out.println("Digite o primeiro número: ");
            double num1 = bota.nextDouble();
            System.out.println("Digite o segundo número: ");
            double num2 = bota .nextDouble();
            double resultadoS = calculadora.Somar(num1, num2);
            System.out.println(resultadoS);
                           
                break;
            case 2:
                System.out.println("Digite o primeiro número: ");
                double num3 = bota.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num4 = bota .nextDouble();
                double restadoSS = calculadora.Subtrair(num3, num4);
                System.out.println(restadoSS);
                    break;
            case 3:
            System.out.println("Digite o primeiro número: ");
            double num5 = bota.nextDouble();
            System.out.println("Digite o segundo número: 1");
            double num6 = bota .nextDouble();
                double resultadoM = calculadora.Multiplicar(num5, num6);
                System.out.println(resultadoM);
                    break;
            case 4:
            System.out.println("Digite o primeiro número: ");
            double num7 = bota.nextDouble();
            System.out.println("Digite o segundo número: ");
            double num8 = bota .nextDouble();
            if (num7 == 0) {
                System.out.println("0 não é divisor.");
            } if ( num8 == 0) {
                System.out.println("0 não é divisor");
            }
                double resultadoD = calculadora.Divisão(num7, num8);
                System.out.println(resultadoD);
                   break;
            case 5:
            System.out.println("Digite o primeiro número: ");
            int num9 = bota.nextInt();
            System.out.println("Digite o segundo número: ");
            int num10 = bota .nextInt();
            if (num9 == 0) {
                System.out.println("0 não é divisor.");
            } if ( num10 == 0) {
                System.out.println("0 não é divisor");
            }
            double resultadoMM = calculadora.Módulo(num9, num10);
            System.out.println(resultadoMM);
            break;
    
            default:
                break;
        }
    }
}