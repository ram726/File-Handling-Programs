import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling3 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		FileInputStream fin=null;
		try {
			fin= new FileInputStream("E:\\Programming\\FileHandling\\FileOutputStream\\second.txt");
			int x=fin.read();
			while(x!=-1)
			{
				System.out.print((char)x);
				x=fin.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("Thank you");
		sc.close();
	}
}
