public class Ball {

    public static int maxBall(int v0) {
        double v = ((double)v0 * 10)/36; 
        double tenth_of_sec = 1;
        double g = 9.81;
        double cur_height = v * (0.1) - 0.5 * g * (0.1) * (0.1);
        double height = cur_height;
        double t = 0.2;
        while (cur_height > 0) {
          cur_height = v * (t) - 0.5 * g * (t) * (t);
          if (cur_height > height) {
            height = cur_height;
            tenth_of_sec = t * 10;
          }
          t = t + 0.1;
        }
        return (int)Math.round(tenth_of_sec);
    }
}

