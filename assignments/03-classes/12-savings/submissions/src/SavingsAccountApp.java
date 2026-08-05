import java.util.Scanner;

public class SavingsAccountApp {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double saldo, juros;

        System.out.println("Informe o saldo inicial: ");
        saldo = input.nextDouble();

        System.out.println("Informe a taxa de juros anual (%): ");
        juros = input.nextDouble();

        SavingsAccount account = new SavingsAccount(saldo);

        account.setJurosAno(juros);

        System.out.println(String.format("Saldos com taxa de juros de %.2f", juros));

        for(int i = 0; i<13;i++){

            account.calculateMonthlyInterest();
            System.out.println(String.format("Mês %d: R$%.2f",i ,account.getSaldoConta()));
        }

        System.out.print("Informe a nova taxa de juros anual: ");
        juros = input.nextDouble();

        account.setJurosAno(juros);

        System.out.println(String.format("Alterando taxa de juros anuala para %.0f",account.getJurosAno()));
        account.calculateMonthlyInterest();
        System.out.println(String.format("Mês 13: R$ %.2f",account.getSaldoConta()));


    } 
}
