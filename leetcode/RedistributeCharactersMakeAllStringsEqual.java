//  1897. Redistribute Characters to Make All Strings Equal

class RedistributeCharactersMakeAllStringsEqual {

    public boolean makeEqual(String[] words) {
        int[] arr = new int[26];
        int len = words.length;
        for(String w: words) {
            for(int i = 0; i < w.length(); i++) {
                arr[w.charAt(i) - 'a']++;
            }
        }
        for(int a: arr) {
            if (a != 0) {
                if(a % len != 0) return false;
            }

        }
        return true;
    }
}