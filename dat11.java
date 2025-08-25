import java.util.*;

public class SimplePermutations {
    public static Set<String> getPermutations(String str) {
        Set<String> result = new HashSet<>();
        permute(str, "", result);
        return result;
    }

    private static void permute(String str, String prefix, Set<String> result) {
        if (str.length() == 0) {
            result.add(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, prefix + str.charAt(i), result);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        Set<String> permutations = getPermutations(input);
        System.out.println(permutations);
    }
}
