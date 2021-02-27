package es.upm.dit.adsw.Threads;

public class Proceso extends Thread{

	private String msg;
	
	public Proceso(String msg) {
		this.msg=msg;	
	}
	
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(msg);
		}
	}
}
