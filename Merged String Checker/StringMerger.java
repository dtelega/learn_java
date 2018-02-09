import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
      if (s.isEmpty() && part1.isEmpty() && part2.isEmpty()) {
        return true;
      }
      
      int a = 0;
      int b = 0;
      String res = "";
      if (part1.length() + part2.length() != s.length())
        return false;
      for (int i = 0; i < s.length(); i++) {
        if (a < part1.length() && s.charAt(i) == part1.charAt(a)) {
          a++;
        }
        if (b < part2.length() && s.charAt(i) == part2.charAt(b)) {
          b++;
        }
      }
      if (a != part1.length() || b != part2.length())
        return false;
      return true;
    }
}

