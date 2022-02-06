package Demo;

 class second implements Runnable
{
	 synchronized public void run()
	{
		for(int i=0;i<7;i++)
		{
			System.out.println(i+" Thread 1");
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
	}
	}
}

 class ones implements Runnable
{
	 synchronized public  void run()
	{
		for(int i=0;i<7;i++)
		{
			System.out.println(i+" Thread 1");
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
	}
}
}
public class ThreadRunnable 

{

	public static void main(String[] args) {
		second s=new second();
		ones o=new ones();
		
		Thread t1=new Thread(s);
		Thread t2=new Thread(o);
		
		t1.start();
		t2.start();
		
	}

}
