package Atividades;

import java.util.Scanner;

public class NumeroCinco {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        
         float valor;
         System.out.print("Digite um valor em dólares: ");
         valor = entrada.nextFloat();

        float dolar = 4.98f;

        float conversão = dolar * valor;
        System.out.println(valor + " dólares são " + conversão + " reais");






    } 
    
}
