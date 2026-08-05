import java.util.Random;
import java.util.Scanner;

public class FortalecerSenha{

    public static String fortalecerSenha(String s){

        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm','n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] senha = s.toCharArray();
        
        Random random = new Random();

        int tamanhoSenha = s.length();

        int posicaoLetraAleatoria = random.nextInt(0, 25);        
        int posicaoAleatoriaSenha = random.nextInt(0,tamanhoSenha);      
        

             for(int i =0; i<= tamanhoSenha; i++){



        }
        



        return "";
    }


    public static void main(String[] args){

        String senha, senhaFortalecida;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        senha = scanner.nextLine();

        senhaFortalecida = fortalecerSenha(senha);

        System.out.println(senha);

        scanner.close();
    }


}