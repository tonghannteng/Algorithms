//  274. H-Index

class HIndex {

    fun hIndex(citations: IntArray): Int {
        Arrays.sort(citations)
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