import java.util.Arrays;

public class GradeAnalyzer {
    
    public static double calculateAverage(int[] notas){

        double totalNotas =0;
        

        for(int i=0; i< notas.length; i++){

            totalNotas = totalNotas + notas[i];

        }

        return totalNotas/notas.length;
    }

    public static int findHighestGrade(int[] notas){
        int maiorNota = 0;
        for(int i= 0; i< notas.length; i ++){
            if(maiorNota<notas[i]){
                maiorNota = notas[i];
            }
        }
        return maiorNota;
    }

    public static int findLowestGrade(int[] notas){

        int menorNota = notas[0];;
        for(int i= 0; i< notas.length -1; i ++){
            if(menorNota > notas[i+1]){
                menorNota = notas[i];
            }
        }
        return menorNota;
    }
    
    public static int countGradesAtOrAboveAverage(int[] notas){

        int contador =0;
        double media = calculateAverage(notas);

        for(int i = 0; i< notas.length; i++){

            if(notas[i] >= media){
                contador ++;
            }

        }

        return contador;
    }

    public static int[] calculateFrequency(int[] notas){

        int[] distribuicao = new int[11];
        Arrays.fill(distribuicao, 0);

        for(int i =0; i<notas.length; i++){
            int posicao = notas[i] / 10;

            distribuicao[posicao] ++;
        }
        return distribuicao;
    }

    // public static String formatFrequencyLine()
    
}
