//  796. Rotate String

class RotateString {
    public boolean rotateString(String A, String B) {
        A = A + A;
        return A.contains(B) && (A.length() - B.length() == B.length());
    }
}