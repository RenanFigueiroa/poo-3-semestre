import java.util.Scanner;
public class ParkingGarageApp{

    public static void main(String[] args){

        Double hours,tatoalTax =0.0, tax;
        int cliente = 1;
        Scanner input = new Scanner(System.in);

        do{
            
            System.out.println("Digite o número de horas estacionadas para o cliente(ou -1 para sair): ");
            hours = input.nextDouble();

            if(hours ==-1){
                System.out.println(String.format("Total arrecadado ontem:R$ %.2f%n", tatoalTax));
                System.out.println("Sistema encerrando...");
            }else if(hours <-1){
                System.out.println("ERROR - O número de horas deve ser positivo!");
            }else{

                tax = ParkingGarage.calculateCharges(hours);
                tatoalTax += tax;

                System.out.println(String.format("Cliente %d: Taxa de estacionamento: R$%.2f%n",cliente, tax));

            }

            cliente++;

        }while(hours != -1);

    }

}