//  1773. Count Items Matching a Rule

class CountItemsMatchingRule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> list: items) {
            switch (ruleKey) {
                case "color":
                    if (list.get(1).equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "type":
                    if (list.get(0).equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "name":
                    if (list.get(2).equals(ruleValue)) {
                        count++;
                    }
                    break;
            }
        }
        return count;
    }
}