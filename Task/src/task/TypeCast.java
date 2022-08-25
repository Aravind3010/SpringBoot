package task;

public class TypeCast {

	public static void main(String[] args) {
		int i=10;             //Widening TypeCasting
		System.out.println(i);
		float f=i;
		System.out.println(f);
		
		double d=10.0;        //Narrowing TypeCasting
		System.out.println(d);
		byte b=(byte)d;
		System.out.println(b);

	}

}
