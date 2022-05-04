public class Solution {
	public String longestPalindrome(String s) {
		if(s.isEmpty())return null;
		if(s.length() == 1) return s;
		String longest = s.substring(0, 1);
		for(int i = 0; i < s.length(); i++) {
			String temp =  helper(i,i,s);
			if (temp.length() > longest.length())
				longest = temp;
			temp =  helper(i,i+1,s);
			if (temp.length() > longest.length())
				longest = temp;
		}
		return longest;
	}
	public String helper(int begin, int end, String s) {
		while(begin >= 0 && end <= (s.length() -1) && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin +1,end);
	}
}

