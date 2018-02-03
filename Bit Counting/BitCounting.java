public class BitCounting {

	public static int countBits(int n){
		String binary = Integer.toBinaryString(n);
    int    count = 0;
    for (char c : binary.toCharArray()) {
      if (c == '1')
        count++;
    }
    return count;
	}
	
}

