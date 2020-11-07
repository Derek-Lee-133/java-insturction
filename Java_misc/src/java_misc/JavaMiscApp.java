package java_misc;

public class JavaMiscApp {

	public static void main(String[] args) {
		int value1 = 10;
		int value2 = 20;

		int min;

//		if (value1 < value2) {
//			min = value1;
//		}else {
//			min = value2;
//		}
		min = value1 < value2 ? value1 : value2;
		System.out.println("min = " + min);

		String x = null;
		
		System.out.println("x length = " + (x == null ? "null" : x.length()));
		
		System.out.println("min of 20 and 10 = " + MathUtils.min(20, 10));
		
		System.out.println("max of 20 and 10 = " + MathUtils.max(20, 10));
		
		System.out.println(MathUtils.sum(1,2,3,4));
		System.out.println(MathUtils.sum(9,8,7));
		System.out.println(MathUtils.power(2, 4));
		
		

	}

}
