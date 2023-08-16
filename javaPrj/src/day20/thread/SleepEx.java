package day20.thread;

public class SleepEx {

	public static void main(String[] args) {
		
		SThread th1 = new SThread();
		th1.start();
		
		SThread2 th2 = new SThread2();
		th2.start();

}
}
class SThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				sleep(2000);
			}catch(InterruptedException e ){
				e.printStackTrace();
			}
			System.out.println((i + 1) + "hi ^^");
		}	
	}
}

class SThread2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((i + 1) + "bye ^^");
		}
	}
}

