//  70. Climbing Stairs

class ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (n == 2) return 2;
        else {
            int n1 = 1;
            int n2 = 2;
            int n3 = 0;
            for (int i = 3; i <= n; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            return n3;
        }
    }
}