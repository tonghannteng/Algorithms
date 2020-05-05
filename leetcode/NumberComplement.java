//  476. Number Complement

class NumberComplement {

    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                b.append("1");
            } else {
                b.append("0");
            }
        }
        return Integer.parseInt(b.toString(), 2);
    }
}