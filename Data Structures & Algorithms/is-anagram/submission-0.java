class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sLetters = s.toCharArray();
        Arrays.sort(sLetters);
        String sReverse = new String(sLetters);
        char[] tLetters = t.toCharArray();
        Arrays.sort(tLetters);
        String tReverse = new String(tLetters);
        if(tReverse.equals(sReverse))
        return true;
        return false;




    }
}
