//  997. Find the Town Judge

class FindTownJudge {
    public int findJudge(int N, int[][] trust) {
        if (trust.length == 0) return N;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int[] aTrust : trust) {
            for (int j = 0; j < trust[0].length; j++) {
                if (j == 0) {
                    hashMap.put(aTrust[j], hashMap.getOrDefault(aTrust[j], 0) + 1);
                } else {
                    hashMap.put(aTrust[j], hashMap.getOrDefault(aTrust[j], 0));
                }
            }
        }
        int t = 0;
        for (Map.Entry<Integer, Integer> m : hashMap.entrySet()) {
            if (m.getValue() == 0) {
                t = m.getKey();
            }
        }
        int count = 0;
        for (int[] aTrust : trust) {
            if (aTrust[1] == t) count++;
        }
        if (count == N - 1) return t;
        return -1;
    }
}