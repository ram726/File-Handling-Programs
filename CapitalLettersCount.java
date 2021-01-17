import java.io.FileInputStream;
import java.io.IOException;
public class CapitalLettersCount 
{
	public static void main(String[] args) throws IOException
	{
		int count=0,i=0;
		FileInputStream fin= new FileInputStream("E:\\Programming\\FileHandling\\FileOutputStream\\src\\FileHandling5.java");
		int x=fin.read();
		while(x!=-1)
		{
			x=fin.read();
			if(x>=65 && x<=90)
			{
				count++;
			}
			else
				i++;
		}	
		System.out.println("Number of Capital Letters Present in File is: "+count);
		System.out.println("Number of Small Letters Present in File is: "+i);
		fin.close(); 
	}
}