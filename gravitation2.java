public class gravitation2
{
	public static void main(String[] args)
	{
		//หาค่า G ว่าเท่ากับ 9.8 หรือไม่
		//ไม่มีการรับ input แค่คำนวณเท่านั้น
		double g,G,m2,R;
		G=6.67e-11;
		m2=5.974e24;
		R=6371e3;
		g=G*m2/(R*R);
		System.out.println("ความเร่งเนื่องจากแรงโน้มถ่วงโลก " +g +" m/(s*s)");
	}
}
