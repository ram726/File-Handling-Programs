//count number of lines in a file
import java.io.FileInputStream;
import java.io.IOException;
public class FileHandling {
public static void main(String[] args) throws IOException
{
	FileInputStream fin =null;
	int count=1;
		fin = new FileInputStream("E:\\Programming\\FileHandling\\FileOutputStream\\src\\FileHandling2.java");
		int x=fin.read();
		while(x!=-1)
		{
			if(x=='\n')
				count++;
			x=fin.read();
		}
		fin.close();
		System.out.println("Number of Lines: "+count);
}
}
