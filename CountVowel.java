import java.io.FileInputStream;
import java.io.IOException;
public class CountVowel 
{
	public static void main(String[] args) throws IOException
	{
		int count=0,i=0;
	FileInputStream fin= new FileInputStream("E:\\Programming\\FileHandling\\FileOutputStream\\src\\FileHandling5.java");
	int x=fin.read();
	while(x!=-1)
	{
		x=fin.read();
		char ch=(char) x;
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		count++;
		else
			i++;
	}	
	System.out.println("Number of Vowel Present in File is: "+count);
	System.out.println("Number of Consonant Present in File is: "+i);
	fin.close(); 
	}
}

