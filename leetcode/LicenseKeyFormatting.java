//  482. License Key Formatting

class LicenseKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                result.append(Character.toUpperCase(s.charAt(i)));
                count++;
            }
            if (count == k) {
                count = 0;
                result.append("-");
            }

        }
        if (result.length() != 0 && result.toString().charAt(result.length() - 1) == '-') {
            result.deleteCharAt(result.length() - 1);
        }
        return result.reverse().toString();
    }
}