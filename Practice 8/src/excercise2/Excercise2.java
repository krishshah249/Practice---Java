package excercise2;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Excercise2 extends TimerTask implements Runnable{

	long start= System.currentTimeMillis();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		TimerTask task = new Excercise2();
		Timer time= new Timer();
		time.schedule(task,new Date(),10000);
		//Thread t = new Thread(new Excercise2());
		//t.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long current= System.currentTimeMillis();
		long sec=(current - start)/1000;
		long min= sec/60;
		sec=sec%60;
		long hr = min/60;
		min= min%60;
		System.out.println("HR:MIN:SEC->"+hr+":"+min+":"+sec);
		
		
	}

}
