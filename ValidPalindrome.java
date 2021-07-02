class ValidPalindrome {
  
    // Steps --> Input: s = "A man, a plan, a canal: Panama"
    //  1. Remove All Spaces --> s = "Aman,aplan,acanal:Panama"
    //  2. Remove all special characters --> s = "AmanaplanacanalPanama"
    //  3. Convert it to be all lower case characters --> s = "amanaplanacanalpanama"
    //  4. Reverse the String to ensure that they are the same
    //  5. Return the resuult of equals to the 2 arrays
    public boolean isPalindrome(String s) {
        s =  s.replaceAll("\\s", ""); // 1
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < charArray.length; i++) { //2
            if (Character.isLetterOrDigit(charArray[i])) sb.append(charArray[i]);
        }
        
        char[] charArray2 = sb.toString().toLowerCase().toCharArray(); //3
        reverseString(charArray2); //4
        
        return Arrays.equals(charArray2, sb.toString().toLowerCase().toCharArray()); //5
    }
    
    private String reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            swap(s, i, s.length - 1 - i);
        }
        return s.toString();
    }
    
    private void swap(char[] s, int index1, int index2) {
        char temp = s[index1];
        s[index1] = s[index2];
        s[index2] = temp;
    }
}
