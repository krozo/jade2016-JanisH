package m01;

public class Singleton{

	static{
		instance = new Singleton();
	}
	public Thread t;
	private static Singleton instance;
	private static long time = 0;
	private Thread innerTimer;
	
	private Singleton()
	{
		innerTimer = new Thread(new Runnable(){

			@Override
			public void run() {
				while(true)
				{
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					time++;
				}
			}
				
		});
		innerTimer.start();
	}
	
	public static Singleton getInstance()
	{
		return instance;
	}
	
	public void printTime()
	{
		System.out.println("Time has passed: " + time);
	}
	
	
}
