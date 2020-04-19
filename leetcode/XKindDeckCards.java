//  914. X of a Kind in a Deck of Cards

class XKindDeckCards {

    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : deck) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int g = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            g = gcd(g, m.getValue());
        }
        return g > 1;
    }

    private int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}