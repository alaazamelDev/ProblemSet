class Solution {
    public char repeatedCharacter(String s) {
        
        List<Character> solList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (!solList.contains(s.charAt(i))) {
                solList.add(s.charAt(i));
                continue;
            }
            return s.charAt(i);
        }
        return '*';
    }
}