//  1446. Consecutive Characters

class ConsecutiveCharacters {

    fun maxPower(s: String): Int {
        var result = 1
        var max = 1
        for (i in 0 until s.length - 1) {
            if (s[i] == s[i + 1]) {
                max++
            } else {
                max = 1
            }
            if (max > result) {
                result = max
            }
        }
        return result
    }
}