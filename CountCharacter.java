import java.io.FileInputStream;
import java.io.IOException;

public class CountCharacter 
{
	public static void main(String[] args) throws IOException
	{
	FileInputStream fin= new FileInputStream("E:\\Programming\\FileHandling\\FileOutputStream\\src\\FileHandling5.java");
	System.out.println(fin.available());
	System.out.println((char)fin.read());
	System.out.println(fin.available());
	fin.skip(0);
	System.out.println((char)fin.read());
	fin.close();
	}
}

