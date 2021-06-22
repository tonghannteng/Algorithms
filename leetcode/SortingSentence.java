//  1859. Sorting the Sentence

class SortingSentence {

    public String sortSentence(String s) {
        if (s == null || s.isEmpty()) return "";
        StringBuilder bf = new StringBuilder();
        String []str = s.split(" ");
        String [] result = new String[str.length];
        for (String value : str) {
            int index = Integer.parseInt(value.substring(value.length() - 1));
            result[index - 1] = value.substring(0, value.length() - 1);
        }
        for (String r: result) {
            bf.append(r).append(" ");
        }
        return bf.toString().trim();
    }
}