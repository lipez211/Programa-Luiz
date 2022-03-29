package Atividades;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.print("nome: ");
            String nome = entrada.nextLine();

            System.out.print("peso: ");
            int peso = entrada.nextInt();

            System.out.print("Altura: "); 
            double Altura = entrada.nextDouble();

            double imc = peso / (Altura*Altura);

            System.out.println("IMC de " + nome + ": " + imc);


    }


}