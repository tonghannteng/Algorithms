//  1196. How Many Apples Can You Put into the Basket

class HowManyApplesBasket {

    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int count = 0;
        int sum = 0;
        for (int w: weight) {
            sum+= w;
            if (sum > 5000) break;
            count++;
        }
        return count;
    }
}