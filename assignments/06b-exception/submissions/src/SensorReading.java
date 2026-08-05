public class SensorReading{

private String sensorId;
private String temperature;

public SensorReading(String sensorId, String temperature){
    
    this.sensorId = sensorId;
    this.temperature = temperature;

}

@Override
public String toString(){
    return String.format("%n||---Stratus do sensor---||%nID sensor: %s%nTemperatura do sensor: %s%n", this.sensorId,this.temperature);
}

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }


}    