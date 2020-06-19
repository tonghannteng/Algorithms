//  275. H-Index II

class HIndexII {

    fun hIndex(citations: IntArray): Int {
        var index = 0
        for (c in citations) {
            if (c >= citations.size - index) {
                return citations.size - index
            } else {
                index++
            }
        }
        return 0
    }
}