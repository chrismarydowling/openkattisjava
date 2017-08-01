import java.util.*;


public class grassseed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double cost = in.nextDouble();
		
		int lawns = in.nextInt();
		
		double area =0;
		
		while (lawns --> 0) {
			area += in.nextDouble() * in.nextDouble();
			
		}
		System.out.printf("%.7f", area * cost);
		
	}

}
