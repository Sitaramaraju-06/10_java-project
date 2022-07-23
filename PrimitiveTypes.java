import java.util.Scanner;
public class PrimitiveTypes
{
	public static void main(String[] args)
	{
		System.out.print("Enter the byte value: ");
		Scanner sc=new Scanner(System.in);
		byte x;
		x=sc.nextByte();
		System.out.print("Enter the short value: ");
		short y;
		y=sc.nextShort();
		System.out.print("Enter the int value: ");
		int z;
		z=sc.nextInt();
		System.out.print("Enter the long value: ");
		long w;
		w=sc.nextLong();
		System.out.print("Enter the boolean value: ");
		boolean s;
		s=sc.nextBoolean();
		System.out.print("Enter the double value: ");
		double t;
		t=sc.nextDouble();
		System.out.print("Enter the float value: ");
		float r;
		r=sc.nextFloat();
		System.out.println("byte default value = "+x);
		System.out.println("short default value = "+y);
		System.out.println("int default value = "+z);
		System.out.println("long default value = "+w);
		System.out.println("boolean default value = "+s);
		System.out.println("double default value = "+t);
		System.out.println("float default value = "+r);
	}
}