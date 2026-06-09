import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(p.length() > s.length()){
            return result;
        }
        for(int i=0; i<=s.length() - p.length(); i++){
            int[] count = new int[26];
            for(int j=0; j<p.length(); j++){
                count[p.charAt(j) - 'a']++;
            }
            for(int j=0; j<p.length(); j++){
                count[s.charAt(i+j) - 'a']--;
            }
            boolean isAnagram = true;
            for(int j=0; j<26; j++){
                if(count[j]>0){
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram){
                result.add(i);
            }
        }
        return result;
    }
}
