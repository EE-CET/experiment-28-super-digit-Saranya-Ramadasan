import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        
        String n = sc.next();
        int k = sc.nextInt();
        
        long initialSum = 0;
        for (int i = 0; i < n.length(); i++) {
            initialSum += Character.getNumericValue(n.charAt(i));
        }
        
        long totalSum = initialSum * k;
        
        System.out.println(getSuperDigit(totalSum));
        
        sc.close();
    }
    
    private static int getSuperDigit(long x) {
        if (x < 10) {
            return (int) x;
        }
        
        long sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        
        return getSuperDigit(sum);
    }
}
