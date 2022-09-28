class Solution {
    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        String xRev = new StringBuilder().append(xStr).reverse().toString();
        return xStr.equals(xRev) ? true : false;
    }
}