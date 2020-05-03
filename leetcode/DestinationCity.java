//  1436. Destination City

class DestinationCity {

    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < paths.size(); i++) {
            String start = paths.get(i).get(0);
            String end = paths.get(i).get(1);
            map.put(start, end);
        }
        String result = paths.get(0).get(1);
        while (map.containsKey(result)) {
            result = map.get(result);
        }
        return result;
    }
}