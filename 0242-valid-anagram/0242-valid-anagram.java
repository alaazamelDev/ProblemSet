class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        scanString(s, sMap);
        scanString(t, tMap);
        
         if (sMap.keySet().size() != tMap.keySet().size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            if (!tMap.containsKey(entry.getKey())) {
                return false;
            }
            if (tMap.get(entry.getKey()).equals(entry.getValue())) {
                continue;
            }
            return false;
        }
        return true;
    }
    

    private void scanString(String t, Map<Character, Integer> tMap) {
        for (int i = 0; i < t.length(); i++) {
            if (!tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), 1);
            } else {
                tMap.replace(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            }
        }
    }

}