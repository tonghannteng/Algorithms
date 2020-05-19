//  1451. Rearrange Words in a Sentence

class RearrangeWordsSentence {
    public String arrangeWords(String text) {
        String[] splitArr = text.split(" ");
        List<String> list = new ArrayList<>();
        for (String s : splitArr) {
            list.add(s.toLowerCase());
        }
        list.sort(Comparator.comparingInt(String::length));
        StringBuilder result = new StringBuilder();
        for (String s : list) {
            result.append(s).append(" ");
        }
        String r = result.toString().trim();
        return Character.toUpperCase(r.charAt(0)) + r.substring(1);
    }
}