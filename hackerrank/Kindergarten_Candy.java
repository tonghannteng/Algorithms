package hackerrank;
/*
 * Alice is a kindergarten teacher. 
 * She wants to give some candy to the children in her class.
 * The children sit in a single row, and each child has a 
 * numeric score that reflects his or her performance in the class.
 * Alice wants to give at least 1 piece of candy to each child.
 * If two children sit next to each other, 
 * then the one with the higher score must get more pieces. 
 * Alice wants to save money, so she needs to minimize the 
 * total number of pieces of candy.
 * Your task is to complete function distributeCandies which takes an 
 * integer array as a parameter representing the performance 
 * score of N children
 */
public class Kindergarten_Candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[] = { 1, 2, 2 };
//		int arr[] = { 2, 4, 2, 6, 1, 7, 8, 9, 2, 1 };
		int arr[] = {2, 4, 2, 6, 1, 7, 8, 9, 3, 2, 1};
		int arrP[] = new int[arr.length];
		arrP[0] = 1;
		int result = 0;

		for (int i = 1; i < arr.length; i++) {
			arrP[i] = arr[i - 1] < arr[i] ? arrP[i] = arrP[i - 1] + 1 : 1;
			// if (arr[i - 1] < arr[i]) {
			// arrP[i] = arrP[i - 1] + 1;
			// } else {
			// arrP[i] = 1;
			// }
		}

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > arr[i + 1]) {
				arrP[i] = Math.max(arrP[i], arrP[i + 1] + 1);
			}
		}

		for (int i : arrP) {
			result += i;
		}
		System.out.println(result);

	}

}
