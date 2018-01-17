public class NumberFun {
  public static long findNextSquare(long sq) {
      if (Math.sqrt(sq++)%1 != 0)
        return -1;
      while (Math.sqrt(sq)%1 != 0)
        sq++;
      return sq;
  }
}
