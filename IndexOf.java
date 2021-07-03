class IndexOf {
    // Using Regex
    public int strStr(String haystack, String needle) {
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(needle);
        java.util.regex.Matcher m = p.matcher(haystack);  
        if (m.find()) return m.start();
        
        return -1;
    }
    
    // Using Substring
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        
        int l1 = haystack.length();
        int l2 = needle.length();
        if (l2 == 0) return l2;
        
        for (int i = 0; i < l1; i++) {
            if (haystack.charAt(i) == needle.charAt(0) && i + l2 <= l1) {
                String substring = haystack.substring(i, i + l2);
                if (substring.equals(needle)) return i;
            }
        }
        
        return -1;
    }
}
