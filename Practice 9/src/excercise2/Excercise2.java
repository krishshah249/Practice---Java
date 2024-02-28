package excercise2;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;

public class Excercise2{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Executor e = Executors.newSingleThreadExecutor();
		long start= System.currentTimeMillis();
		Runnable r = ()->{
			
            while (true) {
                long current = System.currentTimeMillis();
                long sec=(current - start)/1000;
        		long min= sec/60;
        		sec=sec%60;
        		long hr = min/60;
        		min= min%60;
        		System.out.println("HOUR:MINUTE:SECOND->"+hr+":"+min+":"+sec);

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    System.out.println("Timer interrupted");
                }
            }
		};
		  e.execute(r);
		
	}


	

}
