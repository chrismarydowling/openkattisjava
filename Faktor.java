import java.util.Scanner;

public class Faktor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String numb = in.nextLine();
		
		String[] figs = numb.split("\\s");
		
		int a = Integer.parseInt(figs[0]);
		int b = Integer.parseInt(figs[1]);
		
		int sol = (a * (b-1) + 1);
		System.out.println(sol);
	}

}
