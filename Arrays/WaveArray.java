/**
 * 
 * Given an array of integers, sort the array into a wave like array and return it,
 * In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
 *
 */
import java.util.Arrays;

public class WaveArray {

	public int[] wave(int[] A) {
		Arrays.sort(A);
		for (int i = 0; i < A.length - 1; i++) {
			int j = i + 1;
			if (A[i] < A[j] && j % 2 == 1) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			} else if (A[i] > A[j] && j % 2 == 0) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		return A;
	}

}
