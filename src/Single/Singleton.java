package Single;
//eg
public class Singleton {
	//a.�̲߳���ȫ ˽�о�̬�������ӳٻ�ʵ�������������ĺô��ǣ����û���õ����࣬
	 //��ô�Ͳ��ᴴ��˽�о�̬�������Ӷ���Լ��Դ��
	private static Singleton uniqueInstance;
	private Singleton() {}
	public static Singleton getInstance() {
			if(uniqueInstance==null) {
				uniqueInstance=new Singleton();
			}
			return uniqueInstance;
		}
	
}
// b.�̰߳�ȫ ����ʽ
/*ֻ��Ҫ�� getUniqueInstance() ������������ô��һ��ʱ���ֻ����һ���߳��ܹ�����÷������Ӷ������˶� uniqueInstance 
 * ���ж��ʵ���������⡣����������һ�����⣬���ǵ�һ���߳̽���÷���֮�������߳���ͼ����÷���������ȴ���
 * �����������һ������ġ�
 * */
 
/*public static synchronized Singleton getUniqueInstance() {
if (uniqueInstance == null) {
uniqueInstance = new Singleton();
}
return uniqueInstance;
}*/
/* c ����ʽ �̰߳�ȫ
 * �̲߳���ȫ������Ҫ�����ھ�̬ʵ����������ʼ���˶�Σ���ô��̬ʵ����������ֱ��ʵ�����Ϳ��Խ�����⡣
 * ����ֱ�ӳ�ʼ���ķ���Ҳ��ʧ���ӳٳ�ʼ����Լ��Դ�����ơ�*/
/*
 * private static Singleton uniqueInstance = new Singleton();
 * */



//d.˫��У����-�̰߳�ȫ 
/*
 *��Ϊ uniqueInstance ֻ��Ҫ����ʼ��һ�Σ�֮��Ϳ���ֱ��ʹ���ˡ���������ֻ��Ҫ�Գ�ʼ���ǲ��ֵĴ�����У�Ҳ����˵��
 *ֻ�е� uniqueInstance û�б���ʼ��ʱ������Ҫ���м�����
˫��У�������ж� uniqueInstance �Ƿ��Ѿ�����ʼ���ˣ����û�б���ʼ����
��ô�ŶԳ�ʼ���������м��������ֻ��һ���жϣ���ô����̻߳����п���ͬʱ����ʵ��������ģ������Ҫ���˵ڶ��ε��ж�
 */
/*
 * public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
 * 
 * */
