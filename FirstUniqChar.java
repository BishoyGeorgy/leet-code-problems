class FirstUniqChar {
    public int firstUniqChar(String s) {
        int firstUnique = -1;
        for (int i = 0; i < s.length(); i++) {
            if (!s.replaceFirst("" + s.charAt(i), "").contains("" + s.charAt(i))) {
                firstUnique = i;
                break;
            }
        }
        
        return firstUnique;
    }
}
