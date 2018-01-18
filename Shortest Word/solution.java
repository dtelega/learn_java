import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int      len_m=words[0].length();
        for (int i=1;i<words.length;i++) {
          if (len_m > words[i].length())
            len_m = words[i].length();
        }
        return len_m;
    }
}
