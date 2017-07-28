import java.util.Scanner;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String n = in.nextLine();
		int n1 = Integer.parseInt(n);
		
		while (n1 != -1) {
			int time = 0;
			int ttldistance = 0;

			for (int i = 0; i<n1; i++) {
				String sTime = in.nextLine(); 
				
				String[] speedTime = sTime.split("\\s");
				
				int speed = Integer.parseInt(speedTime[0]);
				int ntime = Integer.parseInt(speedTime[1]);
				
				ttldistance = ttldistance + ( speed * (ntime - time));
				
				time = ntime;
			}
			
			System.out.println(ttldistance + " miles");
			
			n = in.nextLine();
			n1 = Integer.parseInt(n);
			
		}
		
	}

}
