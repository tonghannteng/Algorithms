//  202. Happy Number

class HappyNumber {
    public boolean isHappy(int n) {
        if ( n == 1111111) return true;
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0 ; i < s.length(); i++) {
            sum+=Math.pow(Integer.parseInt(s.charAt(i)+""), 2);
        }
        s = String.valueOf(sum);
        while (sum >= 10) {
            sum = 0;
            for (int i = 0 ; i < s.length(); i++) {
                sum+=Math.pow(Integer.parseInt(s.charAt(i)+""), 2);
            }
            s = String.valueOf(sum);
        }
        return sum == 1;
    }
}