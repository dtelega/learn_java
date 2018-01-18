public class GrassHopper {

    public static int summation(int n) {
        int res = n;
        while (--n > 0)
          res += n;
        return res;
    }
}
