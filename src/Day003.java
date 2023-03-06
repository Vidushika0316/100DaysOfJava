public class Day003 {
    public int romanToInt(String s) {
        int sum = 0, pre = 0;
        char ch = 0;

        for (int i = 0; i < s.length(); i++) {
            pre = ch;
            ch = s.charAt(i);

            switch (ch) {
                case 'I':
                    sum++;
                    break;
                case 'V':
                    if (pre == 'I') {
                        sum = sum + 3;
                    } else {
                        sum = sum + 5;
                    }
                    break;
                case 'X':
                    if (pre == 'I') {
                        sum = sum + 8;
                    } else {
                        sum = sum + 10;
                    }
                    break;
                case 'L':
                    if (pre == 'V') {
                        sum = sum + 40;
                    }
                    if (pre == 'X') {
                        sum = sum + 30;
                    } else {
                        sum = sum + 50;
                    }
                    break;
                case 'C':
                    if (pre == 'I') {
                        sum = sum + 98;
                    }
                    if (pre == 'V') {
                        sum = sum + 90;
                    }
                    if (pre == 'X') {
                        sum = sum + 80;
                    } else {
                        sum = sum + 100;
                    }
                    break;
                case 'D':
                    if (pre == 'V') {
                        sum = sum + 490;
                    }
                    if (pre == 'X') {
                        sum = sum + 480;
                    }
                    if (pre == 'L') {
                        sum = sum + 400;
                    }
                    if (pre == 'C') {
                        sum = sum + 300;
                    } else {
                        sum = sum + 500;
                    }
                    break;
                case 'M':
                    if (pre == 'I') {
                        sum = sum + 998;
                    }
                    if (pre == 'V') {
                        sum = sum + 990;
                    }
                    if (pre == 'X') {
                        sum = sum + 980;
                    }
                    if (pre == 'L') {
                        sum = sum + 900;
                    }
                    if (pre == 'C') {
                        sum = sum + 800;
                    } else {
                        sum = sum + 1000;
                    }
                    break;
            }
        }
        return sum;

    }
}

//Roman To Integer
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//        For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//        Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.
//        Given a roman numeral, convert it to an integer.
//
//
//
//        Example 1:
//
//        Input: s = "III"
//        Output: 3
//        Explanation: III = 3.
//        Example 2:
//
//        Input: s = "LVIII"
//        Output: 58
//        Explanation: L = 50, V= 5, III = 3.
//        Example 3:
//
//        Input: s = "MCMXCIV"
//        Output: 1994
//        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
//
//
//        Constraints:
//
//        1 <= s.length <= 15
//        s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
//        It is guaranteed that s is a valid roman numeral in the range [1, 3999].