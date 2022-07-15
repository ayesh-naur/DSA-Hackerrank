import java.util.*;

public class Solution {
    public static boolean palindromeString(String s) {
    	// Write your code here.
        if(null == s) return false;
        Map<Character,Integer> mapNow = new HashMap<>();
        // adding values to the map if key value pair is not exisitng else, incrementing count
        for(Character c : s.toCharArray()){
            if(null == mapNow.get(c)){
                mapNow.put(c,1);
            } else{
                mapNow.put(c, mapNow.get(c)+1);
            }
        }
        
        // checking od nos of letters i.e. if b occurs 3             // times then pallindrome cannot happen
        int oddCount =0;
        for(Integer val : mapNow.values()){
            if(val%2 != 0){
                oddCount++;
            }
        }
        
        // if a lteer occurs more than 1 times i.e. 3 or 5            // then pallindrome cannot happen
        if(oddCount>1) return false;
        
        return true;
        
    }
}
