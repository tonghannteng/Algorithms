//  1742. Maximum Number of Balls in a Box

class MaximumNumberBallsBox {

    public int countBalls(int lowLimit, int highLimit) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int d = sumDigit(i);
            map.put(d, map.getOrDefault(d, 0) + 1);
            result = Math.max(result, map.get(d));
        }
        return result;
    }

    public int sumDigit(int d) {
        int sum = 0;
        while (d != 0) {
            sum+=(d%10);
            d/=10;
        }
        return sum;
    }
}