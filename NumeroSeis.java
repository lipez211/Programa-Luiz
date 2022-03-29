package Atividades;

import java.util.Scanner;

public class NumeroSeis {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

            System.out.print("Digite uma temperatura: ");
            float temperatura;
            temperatura = entrada.nextFloat();

           float conversao = temperatura * 9/5 + 32;
           System.out.print("Temperatu em farenheit é " + conversao);
            



        }    
    }