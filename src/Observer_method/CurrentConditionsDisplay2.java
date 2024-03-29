package Observer_method;
//没有使用接口
public class CurrentConditionsDisplay2 implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay2(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		 System.out.println("Current conditions:"+temperature+"degrees and "+humidity+"% humidity" );
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		display();
	}

}
