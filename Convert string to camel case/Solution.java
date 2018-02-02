import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
   String[] str = new String[10];
   
   if (s.indexOf('-') > 0)
      str = s.split("-");
    else
      str = s.split("_");
    s = str[0];
    for (int i = 1; i < str.length; i++) {
      str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
      s += str[i];
    }  
    return s;
  }
}

