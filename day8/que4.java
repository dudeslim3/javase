		/*create 2 threads. Write a program which displays number
		1 to 10 using class lock.*/
package thread;

class gk implements Runnable
{
	public static void  disp1()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}


public void run()
{
	gk.disp1();
}

}

public class que4 {

	public static void main(String[] args)
	{
		gk ref=new gk();
		gk ref1=new gk();
		
		Thread t1=new Thread(ref);

		Thread t2=new Thread(ref1);
		t1.start();
		t2.start();
		

	}

}
