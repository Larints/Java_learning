import java.util.Random;

public class MinMax {
	public static void main(String[] args) {
		Random random = new Random();
		int nums [] = new int [10];
		int min, max;
		
		for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(0,10);
        }
		
        min = nums[0];
        max = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("min: " + min + " max: " + max);
	}
}
