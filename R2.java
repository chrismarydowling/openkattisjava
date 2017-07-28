import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String numb = in.nextLine();
		
		String[] figs = numb.split("\\s");
		
		int r1 = Integer.parseInt(figs[0]);
		int s = Integer.parseInt(figs[1]);
		int r2 = (s*2 - r1);
		System.out.println(r2);
		
	}

}
