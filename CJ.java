public class CJ {
    public static void main(String[] args) {
        
        CP Cliente = new CP("Marianne", 2607, 8000, 25, 2);
    
        Cliente.Sacar(250);
        Cliente.Depositar(1795);
        Cliente.calcularNovoSaldo(18);
        System.out.println("Cliente" + Cliente.getCliente() + "tem R$" + Cliente.getSaldo() + "de saldo disponível");
        System.out.println("Nome: " + Cliente.getCliente() + "\n Número da Conta: " + Cliente.getNC() + "\n Saldo: " + Cliente.getSaldo() + "Dia de Rendimento: " + Cliente.getDiaDeRendimento());
    }
}