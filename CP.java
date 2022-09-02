public class CP extends CB {

    int diaDeRendimento;
    double taxaRendimento;

    public CP(String Cliente, int NC, int Saldo, int diaDeRendimento, Double taxaRendimento) {
        super(Cliente, NC, Saldo);
        this.diaDeRendimento = diaDeRendimento;
        this.taxaRendimento = taxaRendimento;
    }
    public double getDiaDeRendimento() {
        return diaDeRendimento;
    }
    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    public static void calcularNovoSaldo(double taxaRendimento){
        double novoSaldo = Saldo + taxaRendimento/100;
    }
    
}