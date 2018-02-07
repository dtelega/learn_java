import java.util.Arrays;


public class Kata
{
  public static String sortTheInnerContent(String words)
  {
    String res = "";
    String[] arr = words.split(" ");
    for (String word : arr) {
      String first_c = "" + word.charAt(0);
      String last_c = "";
      if (word.length() > 1)
        last_c += word.charAt(word.length() - 1);
      String middle = "";
      if (word.length() > 2) {
        middle = word.substring(1, word.length() - 1);
        char[] chars = middle.toCharArray();
        Arrays.sort(chars);     
        int begin = 0;
        int end = chars.length - 1;
        char temp;
        while(end>begin) {
          temp = chars[begin];
          chars[begin] = chars[end];
          chars[end] = temp;
          end--;
          begin++;
        }
        middle = new String(chars);
      }
      res += first_c + middle + last_c + " ";
    }
    return res.trim();
  }
}

