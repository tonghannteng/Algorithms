//  1346. Check If N and Its Double Exist

class CheckNandDoubleExist {

    public boolean checkIfExist(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return false;
        List<Double> list = new ArrayList<>();
        for (int n : arr) {
            double d = n;
            if (list.contains(d * 2) || list.contains(d / 2)) {
                return true;
            }
            list.add(d);
        }
        return false;
    }
}