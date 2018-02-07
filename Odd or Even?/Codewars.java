import java.util.*;

public class Codewars {
  public static String oddOrEven (int[] array) {
    return (Arrays.stream(array).sum() % 2 > 0) ? "odd" : "even";
  }
}
