import java.util.Scanner;

public class GradeAnalyzerApp {
    

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        

        GradeAnalyzer analize = new GradeAnalyzer();

        System.out.println("Digite a quantidade de estudantes: ");
        int qtdAlunos = input.nextInt();
        int[] notas = new int[qtdAlunos];

            for(int i=0; i<notas.length; i++){
                System.out.println(String.format("Digete a nota do estudante %d: ", i+1));
                notas[i] =input.nextInt();

            }

        double media = analize.calculateAverage(notas);

        System.out.println(String.format("Média da turma: %.2f",media));

        int maiorNota = analize.findHighestGrade(notas);

        System.out.println(String.format("Maior nota: %d",maiorNota));

        int menorNota = analize.findLowestGrade(notas);

        System.out.println(String.format("Menor nota: %d",menorNota));

        int notasAcimaIgualMedia = analize.countGradesAtOrAboveAverage(notas);

        System.out.println(String.format("Notas acima ou iguais à média: %d",notasAcimaIgualMedia));

        int frequencia = analize.calculateFrequency(notas);

        System.out.println("Distribuição de notas")



        }


}
