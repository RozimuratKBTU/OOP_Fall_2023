package labatory1.lab3;

public class Temperature {
    private double temperature;
    private char scale;

    public Temperature(){
        this.temperature = 0;
        this.scale = 'C';
    }
    public Temperature(double temperature){
        this.temperature = temperature;
        this.scale = 'C';
    }
    public Temperature(char scale){
        this.temperature = 0;
        this.scale = scale;
    }
    public Temperature(double temperature, char scale){
        this.temperature = temperature;
        this.scale = scale;
    }
    public double getTemperatureCelsium(){
        if (scale == 'F'){
            return (5 * (temperature-32))/9;
        }
        return temperature;
    }

    public double getTemperatureFaranheit(){
        if(scale == 'C'){
            return (9*temperature / 5) + 32;
        }
        return temperature;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    public void setScale(char scale){
        this.scale = scale;
    }
    public void setTempuratureAndScale(double temperature, char scale){
        this.temperature = temperature;
        this.scale = scale;
    }

    public char getScale() {
        return scale;
    }
}
