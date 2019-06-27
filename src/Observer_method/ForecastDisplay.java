package Observer_method;

import java.util.Observable;
import java.util.Observer;
public class ForecastDisplay implements Observer,DisplayElement{
	
	private float currentPressure=29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observer observable) {
		((Observable) observable).addObserver(this);
	}
	
	@Override
	public void display() {
		 
		//System.out.println("Current conditions:"+temperature+"degrees and "+humidity+"% humidity" );
	}

	@Override
	public void update(Observable obs, Object arg) {
		 WeatherData weatherData=(WeatherData)obs;
		 if(obs instanceof WeatherData) {
			 lastPressure=currentPressure;
			 currentPressure=weatherData.getPressure();
			 display();
		 }
	}
	
}
