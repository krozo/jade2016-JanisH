package m01;

public class Main {

	public static void main(String[] args) {
		
		double f = 0;
		Singleton inst = Singleton.getInstance();
		
		for(int i = 0; i < 100000000; i++)
		{
			f = f + Math.sqrt(i*f);
			
		}
		
		inst.printTime();
		
	}

}
