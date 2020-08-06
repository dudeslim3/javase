package thread;
/*create 2 threads
one thread will display 1 to 50
second thread will display 50 to 1
both the threads should start simultaneously.*/

class vp implements Runnable
{
	synchronized public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
		
}
class vp1 implements Runnable
{
	synchronized public void run()
	{
		for(int i=5;i>=0;i--)
		{
			System.out.println(i);
		}
	}
	
}



public class ques5 {

	public static void main(String[] args) 
	{
		vp ref=new vp();
		Thread k=new Thread(ref);
		k.start();
		vp1 ref1=new vp1();
		Thread l=new Thread(ref1);
		l.start();
		
	

	}

}
