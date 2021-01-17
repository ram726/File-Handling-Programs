import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling2 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter text");
		String s=sc.nextLine();
		FileOutputStream fout=null;
		try {
			fout= new FileOutputStream("E:\\\\Programming\\\\FileHandling\\\\FileOutputStream\\\\second.txt");
			byte b[]=s.getBytes();
			fout.write(b);
			fout.flush();
			System.out.println("Sucessfully Written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		finally {
			fout.close();
		}
		System.out.println("Thank you");
		sc.close();
	}
}