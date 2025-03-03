import java.util.*;

public class FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int j = 0; j < s.length(); j++) {
            if (charMap.get(s.charAt(j)) == 1) return j;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqChar("helloh"));
    }
}
