import java.util.Scanner;

public class Fibonacci{

    public static long calcularFibonacci(int num){

        if(num == 1){
            return 1;
        }else if(num == 2){
            return 1;
        }

        long termo1 = 1, termo2= 2, atual =0;

        for(int i =3; i<num; i ++){
            atual = termo2 +termo1;
            termo1 = termo2;
            termo2 = atual;
        }
        
        return atual;
    }

    public static String formatarSaida(long fibonacciNum, int num){
        String text = String.format("O %dº número de Fibonacci é: %d",num,fibonacciNum);
        return text;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        long fibonacciNum;
        String texto;

        do{
        System.out.println("Digite um número inteiro não negativo: ");

        num = scanner.nextInt();
        if(num<1){
            System.out.println("O número digitado não é positivo, digite outro número");
        }
        }while(num<1);


        fibonacciNum = calcularFibonacci(num);
        texto = formatarSaida(fibonacciNum, num);

        System.out.println(texto);


        scanner.close();

    }


}