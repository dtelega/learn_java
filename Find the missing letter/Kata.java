public class Kata
{
  public static char findMissingLetter(char[] array)
  {
    int is_lower = 1;
    if (array[0] >= 'A' && array[0] <= 'Z')
      is_lower = 0;
    array = String.valueOf(array).toLowerCase().toCharArray();
    char[] charArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    int i = 0;
    int k = 0;
    while (charArray[i] != array[0])
      i++;
    while (array[k] == charArray[i]) {
      i++;
      k++;
    }
    if (is_lower == 0)
      return Character.toUpperCase(charArray[i]);
    return charArray[i];
  }
}

