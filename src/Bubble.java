import java.util.Iterator;
import java.util.Random;

public class Bubble {
	public static void main(String[] args) {
		Random random = new Random();
		int nums [] = new int [10];
		int a,b,t;
		int size = 10;
		for (int i = 0; i < size; i++) {
            nums[i] = random.nextInt(10);
        }
		System.out.print("Before Sorting: ");
		for(var value : nums) {
			System.out.print(" " + value);
		}
		System.out.println();
		for(a = 1; a < size; a++) {
			for( b = size - 1; b >= a; b--) {
				if (nums[b - 1] > nums[b]) {
					t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
				}
			}
		}
		System.out.println();
		System.out.print("After Sorting: ");
		for(var value : nums) {
			System.out.print(" " + value);
		}
	}
}
