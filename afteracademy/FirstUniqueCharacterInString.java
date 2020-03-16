//  65. First Unique Character In a String

/*
 * @type of s: string
 * @return type: integer
 */
class FirstUniqueCharacterInString {
    public int firstUniqueChar(String s) {
        // write your awesome code here
        if (s.isEmpty()) return -1;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
}