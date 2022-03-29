package Atividades;

import java.util.Scanner;

public class NumeroSete {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
    
        float premio = 780.000f;

        float ganhador1 = premio * 46/100;
        float ganhador2 = premio * 32/100;
        float ganhador3 = premio * 22/100;

        System.out.println("Primeiro ganhador recebeu " + ganhador1 + "00 mil reais");
        System.out.println("Segundo ganhador recebeu " + ganhador2 + "00 mil reais");
        System.out.println("Terceiro ganhador recebeu " + ganhador3 + "00 mil reais");
    }

}
