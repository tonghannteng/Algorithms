package hackerrank;
/*
 * https://www.hackerrank.com/contests/101hack41/challenges/washing-plates
 */
import java.util.Arrays;
import java.util.Scanner;

public class Washing_Plates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = Math.min(sc.nextInt(), n);
		long[] arr = new long[n];
		long sum = 0;
		long p, d;
		for (int i = 0; i < n; i++) {
			p = sc.nextLong();
			d = sc.nextLong();
			sum += d;
			arr[i] = (d + p) * (-1);
		}
		Arrays.sort(arr);
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		System.out.println(Math.max(sum * (-1), 0));

	}

}
