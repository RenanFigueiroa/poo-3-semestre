import java.util.Scanner;
public class CalculadoraPoligono{

    public static double calcularArea(int n, double s){
        double area = (1f/4f) *Math.pow(s,2) *n * (1/Math.tan(Math.PI/n));
        return area;
    }

    public static String formatarSaida(double area){
        String text = String.format("A área do polígono é: %.2f metros quadrados", area);
        return text;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n;
        double s, area;
        String text;

        System.out.println("Digite o número de lados do polígono: ");
        n = scanner.nextInt();

        System.out.println("Digite o comprimento do lado em metros: ");
        s = scanner.nextDouble();

        area = calcularArea(n,s);
        text = formatarSaida(area);

        System.out.println(text);


    }


}