//  1409. Queries on a Permutation With Key

class QueriesPermutationWithKey {

    public int[] processQueries(int[] queries, int m) {
        int[] result = new int[queries.length];
        int[] P = new int[m];
        for (int i = 0; i < m; i++) {
            P[i] = i + 1;
        }
        int[] qq = Arrays.copyOf(queries, queries.length);
        for (int i = 0; i < queries.length; i++) {
            int query = qq[i]; // 1 3 2 1
            int index = findPosition(P, query);
            result[i] = index;
            P = Arrays.copyOf(swap(P, query), P.length);
        }
        return result;
    }

    private int[] swap(int[] arr, int p) {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != p) {
                result[i + 1] = arr[i];
            } else {
                break;
            }
        }
        result[0] = p;
        return result;
    }

    private int findPosition(int[] P, int num) {
        for (int i = 0; i < P.length; i++) {
            if (P[i] == num) {
                return i;
            }
        }
        return 0;
    }
}