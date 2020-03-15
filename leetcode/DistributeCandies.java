//  575. Distribute Candies

class DistributeCandies {

    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int num: candies) {
            set.add(num);
        }
        return Math.min(set.size(), candies.length / 2);
    }
}