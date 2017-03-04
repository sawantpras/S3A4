public class S3A4
{
	//default constructor for class
	public S3A4()
	{
		System.out.println("This is Default Constructor");
	}
	//parameterised constructor with one argument
	public S3A4(String str)
	{
		this();
		System.out.println("Parameterised constructor with single argument");
	}
	//parameterised constructor with two argument
	public S3A4(String str, int num)
	{
		this("Hello");
		System.out.println("Parameterised constructor with two arguments");
	}
	//parameterised constructor with three argument
	public S3A4(int num1, int num2, int num3)
	{
		this("Hello", 2);
		System.out.println("Parameterised constructor with three arguments");
	}
	public static void main(String args[]){
        //Creating an object using Constructor with 3 int arguments
        S3A4 obj = new S3A4(5,5,15);
   }
}