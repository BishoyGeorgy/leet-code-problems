class Anagram {
    // Solution using Maps
    public boolean isAnagramUsingMaps(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> firstString = new HashMap<>();
        Map<Character, Integer> secondString = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            firstString.put(s.charAt(i), firstString.get(s.charAt(i)) == null ? 1 : firstString.get(s.charAt(i)) + 1);
            secondString.put(t.charAt(i), secondString.get(t.charAt(i)) == null ? 1 : secondString.get(t.charAt(i)) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : firstString.entrySet()) {
            if (secondString.get(entry.getKey()) == null) return false;
            if ((int) secondString.get(entry.getKey()) != (int) entry.getValue()) {
                return false;
            }
        }
        
        return true;
    }
    
    // Simple Solution Using Sorting
    public boolean isAnagramUsingSorting(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }
}
