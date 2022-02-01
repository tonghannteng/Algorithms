//  170. Two Sum III - Data structure design

class TwoSumIII {

    private HashMap<Integer, Integer> hashmap;

    public TwoSum() {
        hashmap = new HashMap<Integer, Integer>();
    }

    public void add(int number) {
        hashmap.put(number, hashmap.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
        for(Map.Entry<Integer,Integer> entry : this.hashmap.entrySet()) {
            int minus = value - entry.getKey();
            if (minus != entry.getKey()) {
                if (this.hashmap.containsKey(minus)) {
                    return true;
                }
            } else {
                if (entry.getValue() > 1) return true;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */

