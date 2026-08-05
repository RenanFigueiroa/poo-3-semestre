import java.util.ArrayList;
import java.util.Scanner;

public class SensorMonitorApp{


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String dados;
        int aceitos =0;
        int rejeitados = 0;
        ArrayList<SensorReading> sensorList = new ArrayList<>();
        System.out.println("=== MONITOR DE SENSORES DE TEMPERATURA ===");
        do { 
            System.out.println("Digite as leituras no formato SENSOR_ID;TEMPERATURA ou 'FIM' para encerrar:");
            dados = input.nextLine();
            if (!dados.equalsIgnoreCase("FIM")) {
                try {
                    new SensorMonitor(dados, sensorList).addReading();
                    System.out.println("Sensor registrado com sucesso.");
                    aceitos++;
                } catch (InvalidReadingException e) {
                    rejeitados++;
                    System.out.println(e.getMessage());
                } 
            
            }
            
        } while (!dados.equals("FIM"));

            System.out.println("--- RESUMO DA COLETA ---");
            System.out.println("Leituras válidas registradas:" + aceitos);
            System.out.println("Leituras ignoradas por erro:" + rejeitados);
        


        String idDado;

        System.out.println("--- CONSULTA DE MÉDIA ---");

        do { 

            System.out.println("Digite o ID do sensor que deseja consultar:");

            idDado = input.nextLine();
            if (!idDado.equalsIgnoreCase("ENCERRAR")) {
                try {
                    new SensorMonitor(idDado, sensorList).averageFor();
                   
                } catch (InvalidReadingException e) {
                    
                    System.out.println(e.getMessage());

                } catch (SensorNotFoundException e){
                    
                    System.out.println(e.getMessage());

                }
            
            }
            
        } while (!idDado.equals("ENCERRAR"));
    
    input.close();
    }
    

}