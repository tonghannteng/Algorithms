package hackerrank;

public class FillFountain {

	private int countFillFountain(int [] arr) {

		// Create a fillArray to store the min/right range which cover the max/index
		int[] fillArray = new int[arr.length];
		int count = 1;

		for (int i = 1; i <= arr.length; i++) {
			int max = Math.max(i - arr[i-1], 1);
			int min = Math.min(i + arr[i-1], arr.length);

			// Each max/index, I store the min/right from the max/index
			fillArray[max - 1] = Math.max(fillArray[max-1], min);
		}

		int right = fillArray[0];
		int currentMax = right;

		for (int i = 1; i < arr.length; i++) {
			currentMax = Math.max(currentMax, fillArray[i]);

			// If the fountain can cover at this point, I update the next fountain value
			if (i == right) {
				count++;
				right = currentMax;
			}
		}
		return count;
	}


	public static void main(String[] args) {
		FillFountain fillFountain = new FillFountain();
		int[] fountain = {1, 1, 1};
		int[] fountain1 = {1, 2, 1};
		int[] fountain = {1, 0, 0, 0}
		System.out.println(fillFountain.countFillFountain(fountain));
		System.out.println(fillFountain.countFillFountain(fountain1));

	}
}
