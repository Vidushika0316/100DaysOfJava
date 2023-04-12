public class Day032 {
    public boolean repeatedSubstringPattern(String s) {

        if(s.length()==1) return false;
        if(s.length()==2) return s.substring(0,1).equals(s.substring(1));

        int size = s.length();
        for(int i=2;i<=size/2;i++){
            if(size%i==0){
                String str = s.substring(0,size/i);
                int count = 0;

                for(int j=size/i;j<size;j+=size/i){
                    if(s.substring(j,j+size/i).equals(str)){
                        count++;
                    }else{
                        count=0;
                        break;
                    }
                }

                if(count==i-1) return true;
            }
        }

        int a = s.charAt(0);
        for(char ch : s.toCharArray()){
            if(a!=ch) return false;
        }
        return true;
    }
}

//Repeated Substring Pattern

//    Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
//
//
//
//        Example 1:
//
//        Input: s = "abab"
//        Output: true
//        Explanation: It is the substring "ab" twice.
//        Example 2:
//
//        Input: s = "aba"
//        Output: false
//        Example 3:
//
//        Input: s = "abcabcabcabc"
//        Output: true
//        Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
//
//
//        Constraints:
//
//        1 <= s.length <= 104
//        s consists of lowercase English letters.