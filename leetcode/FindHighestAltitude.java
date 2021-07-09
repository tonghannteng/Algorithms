//  1732. Find the Highest Altitude

class FindHighestAltitude {

    public int largestAltitude(int[] gain) {
        if (gain.length == 0) return 0;
        int max = 0;
        int sum = 0;
        for(int i = 0; i < gain.length; i++) {
            sum+=gain[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}