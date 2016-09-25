/**
 * 
 */
package com.ask.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sahar8
 *
 */
public class EvenSumsGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 4, 5, 3, 7, 2 };
		int[] input1 = { 6 };
		int[] input2 = { 2, 5, 4 };
		System.out.println(new EvenSumsGame().solution(input2));
	}

	public String solution(int[] A) {
		String result = "";
		boolean player1Option = true;
		int xPosition = 1;
		String _2bricksResult = null;
		String _1bricksResult = null;
		int previuousSize = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			list.add(A[i]);
		}
		while (list.size() > 0) {
			if (list.size() != previuousSize) {
				previuousSize = list.size();
			} else {
				break;
			}
			_2bricksResult = _2BricksCheck(xPosition, list, player1Option);

			if (_2bricksResult != null && _2bricksResult.length() > 0) {
				if (result.length() <= 0)
					result = _2bricksResult;
			} else {
				_1bricksResult = _1BricksCheck(xPosition, list, player1Option);
				if (_1bricksResult != null && _1bricksResult.length() > 0) {
					if (result.length() <= 0)
						result = _1bricksResult;
				}
			}

			if (_1bricksResult!=null && _1bricksResult.length() <= 0 && _2bricksResult.length() <= 0 && player1Option) {
				result = "NO SOLUTION";
				break;
			}
			/*if (_1bricksResult!=null && _1bricksResult.length() <= 0 && _2bricksResult.length() <= 0 && !player1Option) {
				break;
			}*/
			if (player1Option) {
				player1Option = false;
			} else {
				player1Option = true;
			}

		}
		return result;

	}

	private String _1BricksCheck(int xPosition, List<Integer> list, boolean player1Option) {
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				if (player1Option) {
					if (result.length() > 0) {
						if (i < xPosition) {
							result = i + "," + (i);
							xPosition = i;
						}
					} else {
						result = i + "," + (i);
						xPosition = i;
					}
				}
				list.remove(i);
				break;
			}
		}

		return result;
	}

	private String _2BricksCheck(int xPosition, List<Integer> list, boolean player1Option) {
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			if (i < list.size() - 2) {
				if ((list.get(i) + list.get(i + 1))%2 == 0) {
					if (player1Option) {
						if (result.length() > 0) {
							if (i < xPosition) {
								result = i + "," + (i + 1);
								xPosition = i;
							}
						} else {
							result = i + "," + (i + 1);
							xPosition = i;
						}
					}
					list.remove(i);
					list.remove(i + 1);
					break;
				}
			}

		}
		return result;
	}

}
