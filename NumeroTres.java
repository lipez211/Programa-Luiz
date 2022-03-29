package Atividades;

import java.util.Scanner;

public class NumeroTres {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        int AnoAtual; 
        AnoAtual = 2022;
        int Nascimento = AnoAtual - idade;
        System.out.println(Nascimento);

    }
    
}
