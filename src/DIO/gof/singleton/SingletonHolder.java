package DIO.gof.singleton;

/*Singleton "Lazy Holder"
 * 
 * @author ipsluizeduardo * 
 * */

public class SingletonHolder {
	private static class InstanceHolder {
		private static SingletonHolder instancia = new SingletonHolder();		
	}
	
	private SingletonHolder() {
		super();
	}
	
	public static SingletonHolder getInstancia() {
		return InstanceHolder.instancia;
	}

}
