import java.util.Scanner;

public class reversebinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int num = Integer.parseInt(in.nextLine());
		
		
		String bin = Integer.toBinaryString(num);
		
		String revbin = new StringBuilder(bin).reverse().toString();
		
		int ans = Integer.parseInt(revbin, 2);
		
		System.out.println(ans);
		
	}

}
