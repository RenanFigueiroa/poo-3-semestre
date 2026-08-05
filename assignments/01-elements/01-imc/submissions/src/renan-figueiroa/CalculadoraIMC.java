import java.util.Scanner; 

public class CalculadoraIMC{


    public static double calcularIMC(double peso, double altura ){


        double IMC = peso/(altura * altura);
        return IMC;
    
    }

    public static String classificarIMC(double imc){

        String classificacao;

    if (imc < 18.5) {
        classificacao = "Abaixo do peso";
    } else if (imc < 25.0) {
        classificacao = "Eutrófico";
    } else if (imc < 30.0) {
        classificacao = "Sobrepeso";
    } else if (imc < 35.0) {
        classificacao = "Obesidade grau I";
    } else if (imc < 40.0) {
        classificacao = "Obesidade grau II";
    } else {
        classificacao = "Obesidade grau III";
    }

        return classificacao;

    }

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        double peso, altura,imc;
        String classificacao;

        System.out.println("Digite seu peso em quilogramas: ");
        peso = scanner.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        altura = scanner.nextDouble();

        imc = calcularIMC(peso, altura);

        classificacao = classificarIMC(imc);

        System.out.printf("Seu iMC é: %.2f%n", imc);
        System.out.println("Classificação: "+ classificacao);

    }

}