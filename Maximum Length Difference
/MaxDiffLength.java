import java.lang.Math;

class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0)
          return -1;
        int max_d = 0;
        for (int i = 0; i < a1.length; i++) {
          for (int k = 0; k < a2.length; k++) {
            if (Math.abs(a1[i].length() - a2[k].length()) > max_d)
              max_d = Math.abs(a1[i].length() - a2[k].length());
          }
        }
        return max_d;
    }
}

