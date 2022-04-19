//  1604. Alert Using Same Key-Card Three or More Times in a One Hour Period

class AlertSameKeyTimesOneHourPeriod {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> result = new LinkedList<>();
        Map<String, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < keyName.length; i++) {
            List<Integer> times;
            if (!hashMap.containsKey(keyName[i])) {
                times = new LinkedList<>();
            } else {
                times = hashMap.get(keyName[i]);
            }
            times.add(stringToTime(keyTime[i]));
            hashMap.put(keyName[i], times);
        }
        for (Map.Entry<String, List<Integer>> keySet : hashMap.entrySet()) {
            if (keySet.getValue().size() < 3) continue;
            List<Integer> t = keySet.getValue();
            Collections.sort(t);
            for (int i = 2; i < t.size(); i++) {
                if (t.get(i) - t.get(i-2) <= 60) {
                    result.add(keySet.getKey());
                    break;
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    private int stringToTime(String time) {
        String[] str = time.split(":");
        return Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
    }
}