public class Kata {

  public static String high(String s) {
    String[] str = s.split(" ");
    int the_highest = 0;
    int count_high = 0;
    for (int i = 0; i < str.length; i++) {
      char[] charArray = str[i].toCharArray();
      int curr_count = 0;
      for (int k = 0; k < charArray.length; k++)
        curr_count += (int)charArray[k] - 96;
      if (curr_count > count_high) {
        count_high = curr_count;
        the_highest = i;
      }
    }
    return str[the_highest];
  }
}

