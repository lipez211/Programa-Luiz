public class CB {

    static String Cliente;
    static int NC;
    static int Saldo;
    double Saque;
    double Deposito;

    public CB(String Cliente, int NC, Double Saldo) {
        this.Cliente = Cliente;
        this.NC = NC;
        this.Saldo = Saldo;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public int getNC() {
        return NC;
    }

    public void setNC(int NC) {
        this.NC = NC;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    
    public static void Sacar(int Saque){
        if(Saldo > 0){
            int sacar = Saldo - Saque;
        }
        else{
            System.out.println("Saldo indisponível.");
        }
        
    }

    public static void Depositar(float Deposito){
        double depositar = Saldo + Deposito;
    }
    
}

