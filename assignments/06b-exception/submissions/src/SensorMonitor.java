import java.util.ArrayList;

public class SensorMonitor{

private String[] text;
private ArrayList<SensorReading> sensores;

    public SensorMonitor(String text, ArrayList<SensorReading> sensores)throws InvalidReadingException{
        this.text = doSplit(text);
        this.sensores = sensores;
    }

    private String[] doSplit(String text){
        String[] dados = text.split(";");
        return dados;
    }

    public void addReading() throws InvalidReadingException {


        if(this.text[0] == null|| this.text[0].trim().isEmpty()){
            throw new InvalidReadingException("ERROR: ID do sensor vazio");
        }
        
        int temperature = Integer.parseInt(this.text[1]);

        if(temperature > 55.0 || temperature< 30.0){
            throw new InvalidReadingException("Temperatura inválida, a faixa de temperatura deve ser entre -30°C a 55°C. ");
        } 

            SensorReading sensor = new SensorReading(this.text[0],this.text[1]);
            this.sensores.add(sensor);            

    }

    public void averageFor() throws SensorNotFoundException{

        boolean verificador= false;
        double soma =0;
        int qtdSensorComMesmoId = 0;

        if(this.text[0] == null|| this.text[0].trim().isEmpty()){
            throw new SensorNotFoundException("Nenhum ID foi selecionado para busca.");
        }
        
        for(SensorReading sensor: this.sensores){

            if(sensor.getSensorId().equals(this.text[0])){
                qtdSensorComMesmoId ++;
                soma += Integer.parseInt(sensor.getTemperature());
                verificador = true;
            }

        }

        if(verificador == false){
            throw new SensorNotFoundException("[ERRO] Sensor 'SENSOR_X' não foi encontrado ou não possui leituras válidas.");
        }else{
            
            double media = soma/qtdSensorComMesmoId;
            System.out.printf("Média do sensor %s: %.2f%n", this.text[0], media);
        }

    }

}