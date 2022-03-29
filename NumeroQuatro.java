package Atividades;

import java.util.Scanner;

public class NumeroQuatro {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira uma velocidade: ");
        float velocidade;
        velocidade = entrada.nextInt();
        
        int metros = 36;
        
        float conversão = velocidade / metros;
        System.out.println(conversão);
        conversão = entrada.nextInt();
        
        


        
    }
    
}
