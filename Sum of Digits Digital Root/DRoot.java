public class DRoot {
  public static int digital_root(int n) {
    String nbr = n+"";

    while (nbr.length() > 1) {
      n = 0;
      for (int i = 0; i < nbr.length(); i++) {
        n += Integer.parseInt(nbr.charAt(i)+"");
      }
      nbr = n+"";
    }
    return Integer.parseInt(nbr);
  }
}

