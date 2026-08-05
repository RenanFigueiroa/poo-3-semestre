import java.util.Scanner;

public class CollatzSequenceApp {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        CollatzSequence sequence1 = new CollatzSequence();

        int n, soma;


        do{
            System.out.println("Digite um número positivo: ");
            n = input.nextInt();
            if(n<0){
                System.out.println("Erro: O número deve ser um inteiro positivo.");
            }

        }while(n < 0);
    
        soma = sequence1.calculateCollatzSum(n);

        System.out.println(String.format("Soma dos termos: %d",soma));

    }

    
}
