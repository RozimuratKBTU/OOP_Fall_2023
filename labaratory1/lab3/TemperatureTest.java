package labatory1.lab3;

public class TemperatureTest {
    public static void main(String[] args){
        Temperature temp1 = new Temperature(); // Default: 0.0 degrees Celsius
        Temperature temp2 = new Temperature(32, 'F');// 32 degrees Fahrenheit


        temp1.setTempuratureAndScale(100, 'C'); // Set to 100 degrees Celsius

        System.out.println("Temp 1 in Celsius: " + temp1.getTemperatureCelsium()+ "°C");
        System.out.println("Temp 1 in Fahrenheit: " + temp1.getTemperatureFaranheit() + "°F");
        System.out.println("Temp 2 in Celsius: " + temp2.getTemperatureCelsium() + "°C");
        System.out.println("Temp 2 in Fahrenheit: " + temp2.getTemperatureFaranheit() + "°F");

        System.out.println("Temp 1 scale: " + temp1.getScale());
        System.out.println("Temp 2 scale: " + temp2.getScale());
    }
}
