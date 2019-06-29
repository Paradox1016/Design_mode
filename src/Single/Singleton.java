package Single;
//eg
public class Singleton {
	//a.线程不安全 私有静态变量被延迟化实例化，这样做的好处是，如果没有用到该类，
	 //那么就不会创建私有静态变量，从而节约资源。
	private static Singleton uniqueInstance;
	private Singleton() {}
	public static Singleton getInstance() {
			if(uniqueInstance==null) {
				uniqueInstance=new Singleton();
			}
			return uniqueInstance;
		}
	
}
// b.线程安全 懒汉式
/*只需要对 getUniqueInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了对 uniqueInstance 
 * 进行多次实例化的问题。但是这样有一个问题，就是当一个线程进入该方法之后，其它线程视图进入该方法都必须等待，
 * 因此性能上有一定的损耗。
 * */
 
/*public static synchronized Singleton getUniqueInstance() {
if (uniqueInstance == null) {
uniqueInstance = new Singleton();
}
return uniqueInstance;
}*/
/* c 饿汉式 线程安全
 * 线程不安全问题主要是由于静态实例变量被初始化了多次，那么静态实例变量采用直接实例化就可以解决问题。
 * 但是直接初始化的方法也丢失了延迟初始化节约资源的优势。*/
/*
 * private static Singleton uniqueInstance = new Singleton();
 * */



//d.双重校验锁-线程安全 
/*
 *因为 uniqueInstance 只需要被初始化一次，之后就可以直接使用了。加锁操作只需要对初始化那部分的代码进行，也就是说，
 *只有当 uniqueInstance 没有被初始化时，才需要进行加锁。
双重校验锁先判断 uniqueInstance 是否已经被初始化了，如果没有被初始化，
那么才对初始化的语句进行加锁。如果只做一次判断，那么多个线程还是有可能同时进入实例化语句块的，因此需要仅此第二次的判断
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
