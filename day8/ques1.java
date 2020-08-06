/*create a multi-threaded application by using 
"extends Thread " method.create 2 threads.
they should display characters from A to J.*/

package thread;
class a extends Thread
{
	public void run()
	{
		for(char c='A';c<='J';c++)
		{
			System.out.println(c);
		}
	}
	
	
}

public class ques1 {

	public static void main(String[] args)
	{
		a ref=new a();
		a ref1=new a();
		
		ref.start();

		ref1.start();
		try
		{
		ref.join();
		ref1.join();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("at last");

	}

}
