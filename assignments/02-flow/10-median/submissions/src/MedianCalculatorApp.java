import java.util.Scanner;

public class MedianCalculatorApp {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        MedianCalculator median1 = new MedianCalculator();

        int mediana, num1, num2,num3;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = input.nextInt();

        mediana = median1.findMedian(num1,num2,num3) ;

        System.out.println(String.format("A mediana dos números é: %d", mediana));
    }
}
