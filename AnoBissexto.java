package Atividades;

    import java.util.Scanner;

        public class AnoBissexto {

            public static void main(String[] args) {

             Scanner entrada = new Scanner(System.in);

             System.out.print("Ano: ");  
             int Ano = entrada.nextInt();

             if((Ano % 4) == 0){
            System.out.print("Ano Bissexto");
        
            }else if(Ano % 100 > 0)

             System.out.print("Não é Bissexto");



    }

    
} 
