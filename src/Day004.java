import java.util.Arrays;

public class Day004 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length-1];
        int x = 0;
        while(x < firstString.length() && x < lastString.length()){
            if(firstString.charAt(x) == lastString.charAt(x)){
                x++;
            } else {
                break;
            }
        }
        return firstString.substring(0, x);
    }
}

//Longest Common Prefix
//Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".
//
//
//
//        Example 1:
//
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.
//
//
//        Constraints:
//
//        1 <= strs.length <= 200
//        0 <= strs[i].length <= 200
//        strs[i] consists of only lowercase English letters.
