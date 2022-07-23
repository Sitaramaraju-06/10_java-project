import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int x;
		x=sc.nextInt();
		if(x%2==0)
		{
			System.out.println(x+ " is even");
		}
		else
		{
			System.out.println(x+ " is odd");
		}
	}
}