	/*create 3 threads in such a way that while
		one thread is executing, 2 threads cannot interfere. 
	they should display output "Exec  0" to "Exec 5".*/

package thread;


class ak implements Runnable
{
	synchronized public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	
}

public class que3 {

	public static void main(String[] args) {
	
		ak ref=new ak();
		Thread k=new Thread(ref);
		Thread l=new Thread(ref);
		k.start();
		l.start();

	}

}
