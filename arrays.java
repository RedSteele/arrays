/**
 * arrays
 *
 * 		Methods for dealing with arrays
 *
 * Sean Steele
 */

public class arrays {



	public static void main(String[] args) {
		int[] nums = {3,6,4,3,2,1,5,6};

		System.out.println(avg(sum(nums), nums));
		System.out.println(findThrees(nums));
	}

	/**
	 * avg
	 * 		Finds the mean of an array of ints
	 *
	 * @param nums - the array
	 * @return the mean
	 */
	public static double avg(double x, int[] nums){
		
		return  x/nums.length;
		
	}


	/**
	 * sum
	 * 		Finds the sum of an array of ints
	 *
	 * @param nums - the array of ints
	 * @return the sum
 	 */
	public static double sum(int[] nums){
		double x = 0;
		for(int i = 0; i < nums.length; i++){
			x += nums[i];
		}
		return x;
	}

	/**
	 * 
	 */
	public static int findThrees(int[] nums){
		int tres = 0;
		for(int i = 0; i < nums.length; i++){
			if (nums[i] == 3){
				tres++;
			}
		}
		return tres;
	}

}