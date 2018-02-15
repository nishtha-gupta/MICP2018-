/* Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
import java.util.Scanner;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class Solution {
public static int lengthOfLongestSubstring(String s) {
        if(s == null || s == ""){
         
            return -1;
        }
        int len = s.length(); // finding length of a string
        
        boolean[] exist = new boolean[256]; // creating exist array of type boolean for 256 characters
        int i = 0, maxLen = 0,j; //initializing variables
        for(j = 0; j < len; j++) {
            while(exist[s.charAt(j)]) { 
                exist[s.charAt(i)] = false; 
                i++;
            }
            exist[s.charAt(j)] = true;
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
}
public static void main(String[] args)
{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = s.nextLine() ;
		
		int len = lengthOfLongestSubstring(str);
		if(len==-1){
		       System.out.println("you have entered invalid or null string ");
		}else{
		    	System.out.println("The length of "
				+ "the longest non repeating character is "+len);
		}
	
	}
  @TestCase
  public static void testCode()
  {
    assertEquals(0,lengthOfLongestSubstring(""));
    assertEquals(1,lengthOfLongestSubstring("bbb"));
    assertEquals(3,lengthOfLongestSubstring("abc"));
    assertEquals(3,lengthOfLongestSubstring("abc?ac"));
    assertEquals(4,lengthOfLongestSubstring("aabbcde"));
    assertEquals(7,lengthOfLongestSubstring("?/*&^abb"));
    assertEquals(5,lengthOfLongestSubstring("??123aa"));
   }
    
    
}
