class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//create a hashmap to store the key(0,1) and the word(strs)
        Map<String, List<String>> store = new HashMap<>();

//loop each strs word one by one
        for (String str : strs){
            // create an empty array to check each letter a-z
            int[] count = new int[26];
            
//Another loop to convert each word into small charectors and place them into the count array 
            for(char st : str.toCharArray()){
                count[st - 'a']++;
            }
//create a string to store count array in as a to strin 0-25 index
//check if hashmap already has that count if it does add it and if it doesnt create a key and value and store it in the hashmap
            String key = Arrays.toString(count);
            store.putIfAbsent(key, new ArrayList<>());
            store.get(key).add(str);
        } 

//return the value in the hashmap
        return new ArrayList<>(store.values());
    }
}
