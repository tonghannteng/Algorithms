//  1189. maximum number of balloons

class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String balloon = "balloon";
        int c = 0;
        for (int i = 0; i < text.length(); i++) {
            if (balloon.contains(text.charAt(i) + "")) {
                hashMap.put(text.charAt(i), hashMap.getOrDefault(text.charAt(i), 0) + 1);
                c++;
            }
        }
        if (c < 5) return 0;
        int count = 0;
        while (true) {
            hashMap.put('b', hashMap.get('b') - 1);
            if (hashMap.get('b') < 0) break;
            hashMap.put('a', hashMap.get('a') - 1);
            if (hashMap.get('a') < 0) break;
            hashMap.put('l', hashMap.get('l') - 2);
            if (hashMap.get('l') < 0) break;
            hashMap.put('o', hashMap.get('o') - 2);
            if (hashMap.get('o') < 0) break;
            hashMap.put('n', hashMap.get('n') - 1);
            if (hashMap.get('n') < 0) break;
            count++;
        }
        return count;
    }
}