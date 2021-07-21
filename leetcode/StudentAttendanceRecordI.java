//  551. Student Attendance Record I

class StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        int count_a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                count_a++;
            }
        }
        if (count_a >= 2) return false;
        return !s.contains("LLL");
    }
}