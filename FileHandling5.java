import java.io.*;
public class FileHandling5 extends Thread
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream fin= new FileInputStream("E:\\Programming\\FileHandling\\FileOutputStream\\src\\FileHandling1.java");
		FileOutputStream fout=new FileOutputStream ("E:\\Programming\\FileHandling\\FileOutputStream\\src\\copy.txt");
		int x=fin.read();
		while(x!=-1)
		{
			fout.write(x);
			x=fin.read();
			sleep(100);
			System.out.print((char)x);
		}
		fout.flush();
		fout.close();
		fin.close();
		System.out.println("File Copied.");
	}
}
