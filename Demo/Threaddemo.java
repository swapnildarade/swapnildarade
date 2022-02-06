package Demo;

public class Threaddemo extends Thread {

	 public void run()
	{
		for (int i=0; i<=5; i++)
		{
			System.out.println(i+" "+getName());
			try {
				Thread.sleep(1000);
				}
			catch(InterruptedException e)
					{
					e.printStackTrace();
					}
		}
	}

	public static void main(String[] args) {
		
		
		Threaddemo ob=new Threaddemo();
		Threaddemo ob1=new Threaddemo();
		
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob1);
		t1.setName("first");
		t2.setName("second");
		t1.start();
		t2.start();
	}	

}
