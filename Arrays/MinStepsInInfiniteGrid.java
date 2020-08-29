/**
 * 
 * You are in an infinite 2D grid where you can move in any of the 8 directions
 * (x,y) to 
 * 	 (x+1, y), 
 *   (x - 1, y), 
 *   (x, y+1), 
 *   (x, y-1), 
 *   (x-1, y-1), 
 *   (x+1,y+1), 
 *   (x-1,y+1), 
 *   (x+1,y-1)
 * You are given a sequence of points and the order in which you need to cover the points.. Give the
 * minimum number of steps in which you can achieve it. You start from the first point.
 * 
 */

import java.util.ArrayList;

public class MinStepsInInfiniteGrid {

	public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
		int stepCount = 0;
		for (int i = 0; i < A.size() - 1; i++) {

			// The distance between two points in x-axis
			int dx = Math.abs(A.get(i) - A.get(i + 1));

			// The distance between two points in y-axis
			int dy = Math.abs(B.get(i) - B.get(i + 1));

			// Step count will be the one which is maximum to reach at the point
			stepCount = stepCount + Math.max(dx, dy);
		}
		return stepCount;
	}

}
