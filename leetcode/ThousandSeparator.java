//  1556. Thousand Separator

class ThousandSeparator {

    public String thousandSeparator(int n) {
        if (n == 0) return "0";
        StringBuilder result = new StringBuilder();
        int mod = 0;
        int count = 0;
        while (n > 0) {
            mod = n % 10;
            n = n / 10;
            count++;
            if (count % 3 == 0) {
                if (n != 0) {
                    result.append(mod).append(".");
                } else {
                    result.append(mod);
                }
            } else {
                result.append(mod);
            }
        }
        return result.reverse().toString();
    }
}