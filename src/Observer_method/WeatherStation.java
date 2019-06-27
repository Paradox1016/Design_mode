package Observer_method;
 
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(78, 88, 29.7f);
		weatherData.setMeasurements(95, 74, 28.8f);
		
	}
}
