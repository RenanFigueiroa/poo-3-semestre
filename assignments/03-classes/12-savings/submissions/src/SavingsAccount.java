public class SavingsAccount{

    private double SaldoConta;
    private static double JurosAno;

    public SavingsAccount(double SaldoConta){
        if(SaldoConta < 0){
            throw new IllegalArgumentException("O saldo não pode ser negativo");

        }
            this.SaldoConta = SaldoConta;
    }

    public void calculateMonthlyInterest() {
    
    
        double mensalTax = (JurosAno / 100.0) / 12.0;

        this.SaldoConta += this.SaldoConta * mensalTax;
    
    }

    public void setJurosAno(Double JurosAno){
        if(JurosAno < 0){
            throw new IllegalArgumentException("A taxa de juros não pode ser negativa");
        }

        this.JurosAno = JurosAno;
    }
    
    public double getJurosAno(){return this.JurosAno;}

    public double getSaldoConta(){return this.SaldoConta;}

}