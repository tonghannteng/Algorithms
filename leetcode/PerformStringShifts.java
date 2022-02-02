//  1427. Perform String Shifts

class PerformStringShifts {

    public String stringShift(String s, int[][] shift) {
        for (int[] arr: shift) {
            if (arr[0] == 0) {
                for (int i = 0; i < arr[1]; i++) {
                    s = shiftLeft(s);
                }
            } else {
                for (int i = 0; i < arr[1]; i++) {
                    s = shiftRight(s);
                }
            }
        }
        return s;
    }

    private static String shiftLeft(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        return sb.append(s.charAt(0)).toString();
    }

    private static String shiftRight(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(s.length() - 1);
        return s.charAt(s.length() - 1) + "" + sb;
    }
}