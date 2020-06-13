//  380. Insert Delete GetRandom O(1)   

class RandomizedSet {

    Map<Integer, Integer> valueMap;
    Map<Integer, Integer> idMap;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        valueMap = new HashMap<>();
        idMap = new HashMap<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (valueMap.containsKey(val)) {
            return false;
        }
        valueMap.put(val, valueMap.size());
        idMap.put(idMap.size(), val);

        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (valueMap.containsKey(val)) {
            int id = valueMap.get(val);
            valueMap.remove(val);
            idMap.remove(id);

            int tail = idMap.getOrDefault(idMap.size(), -99);
            if (tail != -99) {
                idMap.put(id, tail);
                valueMap.put(tail, id);
            }
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        if (valueMap.size() == 0) {
            return -1;
        }
        if (valueMap.size() == 1) {
            return idMap.get(0);
        }
        Random random = new Random();
        int id = random.nextInt(valueMap.size());

        return idMap.get(id);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */