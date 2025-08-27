import java.util.Scanner;

class LongestPalindromicSubstring {
  String longestPalindrome(String str) {
    if (str.length() <= 1) return str;
    String LPS = "";
    for (int i = 1; i < str.length(); i++) {
      // Odd-length palindrome
      int low = i, high = i;
      while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
        low--;
        high++;
      }
      String palindrome = str.substring(low + 1, high);
      if (palindrome.length() > LPS.length()) LPS = palindrome;

      // Even-length palindrome
      low = i - 1; high = i;
      while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
        low--;
        high++;
      }
      palindrome = str.substring(low + 1, high);
      if (palindrome.length() > LPS.length()) {
          LPS = palindrome;
    }
        
    }
    return LPS;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();
    LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
    String result = lps.longestPalindrome(input);
    System.out.println("Longest Palindromic Substring: " + result);
    scanner.close();
  }
}
