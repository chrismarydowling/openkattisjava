import java.util.*;
import java.io.BufferedInputStream;

public class detaileddifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		
		int testCount = Integer.parseInt(in.nextLine());
		
		for (int t = 0; t< testCount; t++) {
			String a = in.nextLine();
			String b = in.nextLine();
			
			System.out.println(a);
			System.out.println(b);
			
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == b.charAt(i)) {
					System.out.print('.');
					
				}
				else {
					System.out.print('*');
				}
			}
			System.out.println();
			System.out.println();

		}
	}

}
