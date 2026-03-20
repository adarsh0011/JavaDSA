import java.util.Scanner;

public class takeinput{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		boolean b = sc.nextBoolean();
		byte z = sc.nextByte();
		double d = sc.nextDouble();
		float f = sc.nextFloat();
		String s = sc.nextLine();
		Long l = sc.nextLong();
		Short ss = sc.nextShort();


		System.out.println(a);
		System.out.println(b);
		System.out.println(z);
		System.out.println(d);
		System.out.println(f);
		System.out.println(s);
		System.out.println(l);
		System.out.println(ss);
	
	}
}
