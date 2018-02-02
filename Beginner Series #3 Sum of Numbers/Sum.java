public class Sum
{
  public int GetSum(int a, int b)
  {
    int sum = 0;

    if (a <= b) {
      while (a <= b)
        sum += a++;
    }
    else {
      while (b <= a)
        sum += b++;
    }
    return sum;
  }
}
