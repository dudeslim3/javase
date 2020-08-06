package thread;




class b implements Runnable
{
	public void run()
	{
		for(char c='A';c<='J';c++)
		{
			System.out.println(c);
		}
	}
}

public class quest2 {

	public static void main(String[] args) {
		b ref=new b();
		Thread k=new Thread(ref);
		Thread l=new Thread(ref);
		k.start();
		l.start();

	}

}
