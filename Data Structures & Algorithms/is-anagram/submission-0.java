class Solution {
    public boolean isAnagram(String s, String t) {

        //checks if they both contain equal length of letters
        if( s.length() != t.length()){
            return false;
        }

        // empty array that will count letter from 0 - 26
        int[] counter = new int[26];

        //we want to check each letter against eachother.
        //we use a for loop where we declare the first index to start-
        // at 0 until the length that s is or t is.
        for(int i = 0; i < s.length(); i++){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        };

        //store couter into count and check if theyre all 0s 
        // if they are return false indicating they are not anagrams
        for(int count : counter){
        if( count != 0){
            return false;
            }
        };
        return true;

}
}