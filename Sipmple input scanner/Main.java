import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a numbers: ");
        int a = reader.nextInt(); // Scans the next token of the input as an int.
        int b = reader.nextInt();
        int c = reader.nextInt();
        if (a == b && a == c)
            System.out.println("equal");
        else
            System.out.println("not equal");
        reader.close();
    }
}

