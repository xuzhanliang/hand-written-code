package DesignPattern;

public class Singleton1 {

	private Singleton1(){}
	private volatile static Singleton1 single = null;
	public static Singleton1 getInstance(){
		if(single == null){
			synchronized (Singleton1.class) {
				if(single==null){
					single = new Singleton1();
				}
			}
		}
		return single;
	}
}
