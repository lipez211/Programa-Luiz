public class CE extends CB {

    double limite;
    public CE(String Cliente, int NC, Double Saldo) {
        super(Cliente, NC, Saldo);
    }
    public static void Sacar(Double Saque){
        double sacar = Saldo - Saque;
    }    
}