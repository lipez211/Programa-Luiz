import java.util.Scanner;
public class Exerc2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

            System.out.print("Insira o valor de seu produto: ");
            double valor = entrada.nextFloat();

            System.out.println("Em estados diferentes digite (OE)");

            System.out.print("Insira o estado de destino: ");
            String estado = entrada.next();

            double porcentagem;

            if (estado.equals("MG") || estado.equals("mg") || estado.equals("Minas Gerais") || estado.equals("minas gerais")){

                porcentagem = valor * 0.07 + valor;
                System.out.println(porcentagem);

            }else if (estado.equals("SP") || estado.equals("sp") || estado.equals("São paulo") || estado.equals("Sao Paulo") || estado.equals("são paulo") || estado.equals("sao paulo")){
                porcentagem = valor * 0.12 + valor;
                System.out.println(porcentagem);

            }else if (estado.equals("RJ") || estado.equals("rj") || estado.equals("Rio de Janeiro") || estado.equals("rio de janeiro")){

                porcentagem = valor * 0.15 + valor;
                System.out.println(porcentagem);
            
            } else if (estado.equals("OE")){

                porcentagem = valor * 0.09 + valor;
                System.out.println(porcentagem);
            }
                    
             
        
        }
    
}
