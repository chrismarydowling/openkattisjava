import java.util.*;

public class Planina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double num = Double.parseDouble(in.nextLine());
		
		double num1 = Math.pow(2, num) + 1;
		double ans =  Math.pow(num1, 2);
		
		System.out.println(Math.round(ans));
		
	}

}
