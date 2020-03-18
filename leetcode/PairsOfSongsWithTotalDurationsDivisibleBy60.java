//  1010. pairs-of-songs-with-total-durations-divisible-by-60

class PairsOfSongsWithTotalDurationsDivisibleBy60 {

    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int mod, num;
        for (int n : time) {
            mod = n % 60;
            num = (60 - mod) % 60;
            if (hashMap.containsKey(mod)) {
                count += hashMap.get(mod);
            }
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);

        }
        return count;
    }
}