import java.util.Scanner;
class AreaOfTriangle
{
	public static void main(String[] args)
	{
		System.out.print("Enter the base of triangle: ");
		Scanner sc=new Scanner(System.in);
		float x,a;
		x=sc.nextFloat();
		System.out.print("Enter the height of triangle: ");
		float y;
		y=sc.nextFloat();
		float s=0.5f;
		a=s*x*y;
		System.out.println("Area of Triangle is: "+a);
	}
	
}