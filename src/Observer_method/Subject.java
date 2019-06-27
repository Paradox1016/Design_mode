package Observer_method;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);		//注册或者删除观察者
	public void notifyObservers();				//主题改变通知所有观察者
}
