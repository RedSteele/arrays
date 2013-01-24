public class arrays {

	public static void main(String[] args) {
		int[] nums = {3,6,4,3,2,1,5,6};

		System.out.println(avg(sum(nums), nums));
	}

	public static double avg(double x, int[] nums){
		
		return  x/nums.length;
		
	}

	public static double sum(int[] nums){
		double x = 0;
		for(int i = 0; i < nums.length; i++){
			x += nums[i];
		}
		return x;
	}

}