class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){return false;}
        String xStr = String.valueOf(x);
        String xRev = new StringBuilder().append(xStr).reverse().toString();
        return xStr.equals(xRev) ? true : false;
    }
}