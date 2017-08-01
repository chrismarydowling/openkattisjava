import java.util.*;

public class filip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String ab = in.nextLine();
		String[] abs = ab.split("\\s");
		
		
		int ar = Integer.parseInt(new StringBuffer(abs[0]).reverse().toString());
		int br = Integer.parseInt(new StringBuffer(abs[1]).reverse().toString());
		
		
		if (ar>br) {
			System.out.println(ar);
		}
		else {
			System.out.println(br);
		}
		
		
	}

}
