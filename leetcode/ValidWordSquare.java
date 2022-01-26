//  422. Valid Word Square

class ValidWordSquare {

    public boolean validWordSquare(List<String> words) {
        int length = words.size();
        char[][] matrix = new char[length][length];
        for (int i = 0; i < words.size(); i++) {
            char[] ch = words.get(i).toCharArray();
            if (ch.length > length) return false;
            for (int j = 0; j < ch.length; j++) {
                matrix[i][j] = ch[j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) return false;
            }
        }
        return true;
    }
}