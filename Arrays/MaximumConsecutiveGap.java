import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumConsecutiveGap {

	public static int maximumGap(final List<Integer> A) {
		List<Integer> B = new ArrayList<>(A);
		int max = 0;
		Collections.sort(B);
		for (int i = 0; i < A.size() - 1; i++) {
			if ((B.get(i + 1) - B.get(i)) > max) {
				max = B.get(i + 1) - B.get(i);
			}
		}
		return max;
	}
}
