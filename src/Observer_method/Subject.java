package Observer_method;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);		//ע�����ɾ���۲���
	public void notifyObservers();				//����ı�֪ͨ���й۲���
}
