import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling1
{
	public static void main(String[] args) throws IOException {
		int x=389895;
		FileOutputStream fout=null;
		try {
			fout=new FileOutputStream("E:\\Programming\\FileHandling\\FileOutputStream\\first.txt");
			fout.write((x));
			fout.flush();
			System.out.println("Successfully Written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	finally {
		try {
			fout.close();
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}
		System.out.println("Thank You");
		
	}
}

