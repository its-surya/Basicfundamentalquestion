/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.

---------------------------------------------------
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
-------------------------------------------------------------------

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
Therefore it is not a palindrome.
----------------------------------------------------------------------------------------
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
----------------------------------------------------------------------------------------
Constraints:

-231 <= x <= 231 - 1


 */



public class Main {
    public static void main(String[] args) {
        Solution x=new Solution();
        x.isPalindrome(-121);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        String y=String.valueOf(x);// to take integer as a string.
        int i=0,j=y.length()-1;
        while (i<j){
            if (y.charAt(i)!=y.charAt(j)){
                return false;// as soon as the characters Mismatch we get out of the loop.
            }
            i++;
            j--;
        }
        return true;
    }
}