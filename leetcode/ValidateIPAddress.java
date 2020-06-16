//  468. Validate IP Address

class ValidateIPAddress {

    public String validIPAddress(String IP) {
        if (IP == null || IP.length() == 0) {
            return "Neither";
        }
        if (IP.contains(".")) {
            return checkIPV4(IP);
        } else if (IP.contains(":")) {
            return checkIPV6(IP);
        }

        return "Neither";
    }

    private String checkIPV4(String ip) {
        String N = "Neither";
        if (ip.charAt(0) == '.' || ip.charAt(ip.length() - 1) == '.') {
            return N;
        }
        String[] segments = ip.split("\\.");
        if (segments.length != 4) {
            return N;
        }
        for (String segment : segments) {
            if (segment.length() == 0 || segment.length() > 3 || (segment.charAt(0) == '0' && segment.length() > 1)) {
                return N;
            }
            for (int i = 0; i < segment.length(); i++) {
                if (segment.charAt(i) < '0' || segment.charAt(i) > '9') {
                    return N;
                }
            }
            if (Integer.parseInt(segment) > 255) {
                return N;
            }
        }
        return "IPv4";
    }

    private String checkIPV6(String ip) {
        String N = "Neither";
        if (ip.charAt(ip.length() - 1) == ':') {
            return N;
        }
        String[] segments = ip.split(":");
        if (segments.length != 8) {
            return N;
        }
        for (String segment : segments) {
            if (segment.length() == 0 || segment.length() > 4) {
                return N;
            }
            for (int i = 0; i < segment.length(); i++) {
                char c = segment.charAt(i);
                if (!(c >= '0' && c <= '9') && !(c >= 'a' && c <= 'f') && !(c >= 'A' && c <= 'F')) {
                    return N;
                }
            }
        }
        return "IPv6";
    }
}