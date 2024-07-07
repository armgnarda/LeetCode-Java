class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
		int result = words[words.length-1].length();
		return result;
    }
}