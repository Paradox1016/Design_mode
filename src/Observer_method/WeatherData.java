package Observer_method;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class WeatherData extends Observable {

	//private ArrayList observers;		//记录观察者，此ArrayList是在构造器中建立的
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		//observers=new ArrayList();		不需要构造
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
}
