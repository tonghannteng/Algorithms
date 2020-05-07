//  1431. Kids With the Greatest Number of Candies

class KidsWithGreatestNumberCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int n : candies) {
            if (n > max) {
                max = n;
            }
        }
        for (int n : candies) {
            result.add(n + extraCandies >= max);
        }
        return result;
    }
}