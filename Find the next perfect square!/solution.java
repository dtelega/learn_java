public class NumberFun {
  public static long findNextSquare(long sq) {
  	long root = (long) Math.sqrt(sq);
    return root%1 ? -1 : (root + 1) * (root + 1);
  }
}
