//  1347. Minimum Number of Steps to Make Two Strings Anagram

class MinimumNumberStepsMakeTwoStringsAnagram {

    fun minSteps(s: String, t: String): Int {

        var count = 0
        val arrayChar = IntArray(26)
        for (i in s.indices) {
            arrayChar[s[i] - 'a']++
        }
        for (i in t.indices) {
            if (arrayChar[t[i] - 'a'] > 0) {
                arrayChar[t[i] - 'a']--
            }
        }
        for (num in arrayChar) {
            count += num
        }
        return count
    }
}