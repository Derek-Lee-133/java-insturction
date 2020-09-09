
public class CalculaterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to my calculator");
		int n1 = 5;
		int n2 = 7;
		double d1 = 14.3;
		double d2 = 55.5;
		double d3 = .5;
		
		System.out.println("n1 + n2 ="+(n1+n2));
		
		int diff = n2 - n1;
		System.out.println("dif = "+diff);
		
		double diff2;
		diff2 = d2 - n2;
		System.out.println("diff2 ="+diff2);
		
		double product = (int) (n2 * d2);
				System.out.println("product = "+product);
				
				n2 = n2 +1;
				System.out.print ("n2 = "+n2);
	}
}
