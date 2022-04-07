//  252. Meeting Rooms

class MeetingRooms {

    fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
        intervals.sortBy { it.first() }
        // intervals.sortWith(compareBy({it[1]}, {it[0]}))
        for (i in 1 until intervals.size) {
            val prev = intervals[i-1]
            val current = intervals[i]
            if (current[0] < prev[1]) return false
        }
        return true
    }
}