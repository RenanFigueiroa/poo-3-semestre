
import java.util.Scanner;
public class PassosElefante{

    public static int calcularPassosMinimos(int posicao){

        int qtdpassos = posicao/5;
        if(posicao%5 >0 ){
            qtdpassos += 1;
        }
  

        return qtdpassos;

    }

    public static String formatarSaida(int passos){

        String texto;

        texto = String.format("O número mínimo de passos necessário é: %d", passos);

        return texto;
    }


    public static void main(String[] args){

        int posicao, passos;
        String texto;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a posição da casa do amigo: ");

        posicao = scanner.nextInt();

        passos = calcularPassosMinimos(posicao);
        texto = formatarSaida(passos);

        System.out.println(texto);


        scanner.close();
    }

    
}