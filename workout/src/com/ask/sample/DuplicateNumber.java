package com.ask.sample;

public class DuplicateNumber {

	public int findDuplicate(int[] nums) {
		int l = 1, r = nums.length - 1;
		while (l < r) {
			int m = (l + r) / 2;
			int c = 0;

			for (int i : nums) {
				if (i <= m) {
					c++;
				}
			}

			// if c < m,
			if (c > m) {
				r = m;
			} else {
				l = m + 1;
			}
		}

		return r;
	}
	
	public static void main(String[] args) {
		DuplicateNumber duplicateNumber = new DuplicateNumber();
		int[] num = {2,1,5,3,4,5,6};
		System.out.println(duplicateNumber.findDuplicate(num));
	}
}
