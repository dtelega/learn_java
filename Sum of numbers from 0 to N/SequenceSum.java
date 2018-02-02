public class SequenceSum{

  public static String showSequence(int value){
    if (value < 0)
      return value+"<0";
    else if (value == 0)
      return "0=0";
    
    int sum = 0;
    String res = "";
    
    for (int i = 0; i <= value; i++) {
      sum += i;
      res += i;
      if (i != value)
        res += "+";
    }
    return res+" = " + sum;
  }

  /*public static void main(String args[]){
    int param=Integer.ParseInt(args[0]);
    SequenceSum.showSequence(param);
  }*/
}
