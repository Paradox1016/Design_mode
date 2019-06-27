package Observer_method;

import java.util.ArrayList;

public class WeatherData_from_subject implements Subject {

	private ArrayList observers;		//记录观察者，此ArrayList是在构造器中建立的
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData_from_subject() {
		observers=new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i=observers.indexOf(o);
		if(i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++) {
			Observer observer= (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}
	
}
