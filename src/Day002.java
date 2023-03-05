public class Day002 {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }
}

