import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class S3A42 {   //static variables declaration
	static int roll_no;
	static String name;
	static float marks;
	static final String course="Java";
	BufferedReader br;

	S3A42()throws IOException // constructor declaration
	{
	br=new BufferedReader(new InputStreamReader(System.in)); // accept student detail
	System.out.println("Enter name");
	name=br.readLine();
	System.out.println("Enter marks");
	marks=Float.parseFloat(br.readLine());
	}
	static void display() // static display method declaration
	{
	System.out.println(++roll_no +" "+name+" "+marks+" "+course);
	}
	
	public static void main(String ...args)throws IOException
	{
		S3A42 s1=new S3A42();
		s1.display(); //calling display method
		
		
	}

}
