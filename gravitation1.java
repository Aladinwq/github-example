import java.util.Scanner;
public class gravitation1
{
	public static void main(String[] args)5
	{
		double f,G,m1,m2,R;
		Scanner sc=new Scanner(System.in);
		m1=sc.();
		m2=sc.nextDouble();
		R=sc.nextDouble();
		G=6.611;				
		f=m1*m2/(R*R);
		System.out.println(f);
		
		/*
		 มวลโลก 5.974e24 kg
		 มวลดวงจันทร์ 7.349e22 kg
		 ระยะห่างโลกกับดวงจันทร์ 3.844e8 m
		 f ควรได้ 1.982e20 kg
		 */
	}
}
