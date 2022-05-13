class Solution {
    public boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        StringBuilder sb = new StringBuilder(xString);
        if(xString.equals(sb.reverse().toString())) return true;
        else return false;
    }
}
