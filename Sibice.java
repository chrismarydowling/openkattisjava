import java.util.*;

public class Sibice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine(); 
		
		String[] s1 = s.split("\\s");
		
		double n = Double.parseDouble(s1[0]);
		double w = Double.parseDouble(s1[1]);
		double h = Double.parseDouble(s1[2]);
		
		double m = (Math.pow(Math.pow(w,2) + Math.pow(h,2), 0.5)  );
		
		for (double i = 0; i<n; i++) {
			String o = in.nextLine();
			double p = Double.parseDouble(o);
			if (p <= m) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}
	}

}
