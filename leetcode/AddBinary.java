//  67. Add Binary

import java.math.BigInteger;

class AddBinary {
    public String addBinary(String a, String b) {
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }
}