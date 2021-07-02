class ReverseInteger {
    public int reverse(long x) {
        try {
            StringBuilder sb = new StringBuilder(Math.abs(x));
            if (sb.length() == 1) return (int) x;

            int i = sb.length() - 1;
            while(sb.charAt(i) == '0') {
                sb = sb.deleteCharAt(i);
                i--;
            }
            String string = sb.reverse().toString();
            return Integer.parseInt(x < 0 ? "-" + string : string);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
