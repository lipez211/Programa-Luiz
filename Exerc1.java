import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o nome do produto: ");
        String produto = entrada.next();

        System.out.print("Insira o modelo do produto: ");
        String modelo = entrada.next();

        System.out.print("Digite o tamanho do produto: ");
        float tamanho = entrada.nextFloat();

        System.out.print("Digite o valor do produto R$: ");
        double valor = entrada.nextDouble();

        System.out.print("Digite a quantidade: ");
        int qntd = entrada.nextInt();
    }
    
}
