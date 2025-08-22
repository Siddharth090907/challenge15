public class ReverseWords {
    public static String reverseWords(String s) {
        // Trim leading/trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // Reverse the array of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) reversed.append(" ");
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String s = "   Java   is   awesome   ";
        System.out.println(reverseWords(s)); // Output: "awesome is Java"
    }
}
