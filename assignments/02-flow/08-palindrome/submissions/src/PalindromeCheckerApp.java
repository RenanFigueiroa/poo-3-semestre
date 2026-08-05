import java.util.Scanner;

public class PalindromeCheckerApp{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        PalindromeChecker palidrome = new PalindromeChecker();

        boolean controler;
        String text;
        String textTiny;

        System.out.println("Digite uma sequência: ");

        do{

            text = input.nextLine();
            controler = palidrome.isValidInput(text);
            if(!controler){
                System.out.println("Erro: A entrada não pode estar vazia.");
            }

        }while(!controler);

        textTiny = text.toLowerCase();

        if(palidrome.isPalindrome(textTiny)){
            System.out.println(String.format("A sequência \"%s\" é um palíndromo.", text));
        }else{
            System.out.println(String.format("A sequência \"%s\" não é um palíndromo.", text));
        }

    }
}