import java.util.ArrayList;

public class Line {
   public static String WhoIsNext(String[] names, int n)
     {
       ArrayList<String> list = new ArrayList<String>();
       for (int i = 0; i < names.length; i++)
         list.add(names[i]);
       for (int i = 0; i < n-1; i++) {
         list.add(list.get(0));
         list.add(list.get(0));
         list.remove(0);
         list.trimToSize();
       }
       return list.get(0);
     }
}

