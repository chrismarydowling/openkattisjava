import java.util.*;

public class pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int lg = 0;
		int cont = -1;
		
		for (int i = 0; i < 5; i++) {
			String[] list = in.nextLine().split("\\s");
			int acc = 0; 
			
			for (int j=0; j < list.length; j++) {
				acc += Integer.parseInt(list[j]);
				
			}
			
			if (acc > lg) {
				lg = acc;
				cont = i+1;
				
			}
		}
		System.out.println(cont + " "+ lg );
	
	}
	

}
