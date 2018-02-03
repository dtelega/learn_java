public class BitCounting {

	public static int countBits(int n){
    int    count = 0;
    for (char c : Integer.toBinaryString(n).toCharArray()) {
      if (c == '1')
        count++;
    }
    return count;
	}	
}
