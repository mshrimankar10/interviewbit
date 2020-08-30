/**
 * 
 * A hotel manager has to process N advance bookings of rooms for the next season. His hotel has C rooms. 
 * Bookings contain an arrival date and a departure date. He wants to find out whether there are enough rooms 
 * in the hotel to satisfy the demand. Write a program that solves this problem in time O(N log N)
 * 
 */

import java.util.ArrayList;
import java.util.Collections;

public class HotelBookingsPossible {

	public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
		Collections.sort(depart);
		Collections.sort(arrive);
		int i = 0;
		int j = 0;

		while (i < arrive.size() && j < depart.size()) {
			if (arrive.get(i) < depart.get(j)) {
				i++;
				K--;
			} else if (arrive.get(i) == depart.get(j)) {
				i++;
				j++;
			} else {
				j++;
				K++;
			}

			if (K < 0)
				return false;
		}
		return true;
	}

}
