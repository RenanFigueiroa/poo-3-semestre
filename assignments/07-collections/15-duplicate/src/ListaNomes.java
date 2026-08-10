import java.util.HashSet;
import java.util.Scanner;

public class ListaNomes{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HashSet<String> nomes = new HashSet<>();
        String text;

        System.out.println("Digite os nomes(Digite 'fim' para encerrar):");

        do { 
            text = input.nextLine();
            if(!text.equalsIgnoreCase("FIM")){
                nomes.add(text);
            }
            
        } while (!text.equalsIgnoreCase("FIM"));

        System.out.println("Nomes cadastrados:");
        System.out.println(nomes);
        System.out.println("");
        System.out.println("Pesquisar nomes (digite 'sair para encerrar')");
        do { 
            
            text = input.nextLine();
            if(text.equalsIgnoreCase("SAIR")){
                System.out.println("Encerrando o sistema...");
            }else if(nomes.contains(text)){
                System.out.println("Nome encontrado.");
            }else{
                System.out.println("Nome não encontrado.");
            }
        } while (!text.equalsIgnoreCase("sair"));

    }


}
