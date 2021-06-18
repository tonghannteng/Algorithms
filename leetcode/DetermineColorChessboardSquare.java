//  1812. Determine Color of a Chessboard Square

class DetermineColorChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        char first = coordinates.charAt(0);
        char second = coordinates.charAt(1);
        if (first % 2 == 1 && second % 2 == 0) {
            return true;
        }
        return first % 2 == 0 && second % 2 == 1;
    }
}