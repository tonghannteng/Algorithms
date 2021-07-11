//  989. Add to Array-Form of Integer

class AddArrayFormInteger {

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new ArrayList<>();
        int mod;
        for (int i = A.length - 1; i >= 0; i--) {
            result.add((A[i] + K) % 10);
            K = (A[i] + K) / 10;
        }
        while (K > 0) {
            mod = K%10;
            K = K/10;
            result.add(mod);
        }
        Collections.reverse(result);
        return result;
    }
}