//  60. Permutation Sequence

import java.util.ArrayList;
import java.util.List;

class PermutationSequence {

    public String getPermutation(int n, int k) {
//        https://leetcode.com/problems/permutation-sequence/discuss/696452/Algorithm-Explained-w-example
        int[] factorial = new int[n];
        List<Integer> list = new ArrayList<>();
        list.add(1);

        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
            list.add(i + 1);
        }
        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            int j = k / factorial[i];
            k -= j * factorial[i];

            sb.append(list.get(j));
            list.remove(j);
        }
        return sb.toString();
    }

}