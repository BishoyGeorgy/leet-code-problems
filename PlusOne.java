class PlusOne {
    
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                break;
            } 
            
            digits[i] = 0;
            if (i == 0) {
                int[] digits2 = Arrays.copyOf(digits, digits.length + 1);
                digits2[0] = 1;
                digits = digits2;
            }
        }
        
        return digits;
    }
}
