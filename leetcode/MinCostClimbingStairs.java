//  746. Min Cost Climbing Stairs

class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[cost.length + 1];
        for(int i = 2; i < arr.length; i++) {
            int slow = arr[i-1] + cost[i-1];
            int fast = arr[i-2] + cost[i-2];
            arr[i] = Math.min(slow, fast);
        }
        return arr[arr.length - 1];
    }
}