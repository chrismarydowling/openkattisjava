import java.util.*;



public class modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		int test = 0;
		
		for (int i = 0; i <10; i++) {
			test = in.nextInt() % 42;
			
			if (!nums.contains(test)) {
				nums.add(test);
			}
		
		
		}
		System.out.println(nums.size());
		
		
	}

}
