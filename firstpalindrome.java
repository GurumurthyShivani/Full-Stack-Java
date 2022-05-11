Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.

 




class Solution {
  public String firstPalindrome(String[] words) {
    for (final String word : words)
      if (isPalindrome(word))
        return word;
    return "";
  }

  private boolean isPalindrome(final String s) {
    int i = 0;
    int j = s.length()-1;
    while (i < j)
      if (s.charAt(i++) != s.charAt(j--))
        return false;
    return true;
  }
}
