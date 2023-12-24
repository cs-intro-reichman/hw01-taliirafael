/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
    public static void main(String[] args) {
    int a = Integer.parseInt(args[0]); int b = Integer.parseInt(args[1]);
    int m = a + (int)(Math.random() * (b - a)); 
    int n = a + (int)(Math.random() * (b - a)); 
    int o = a + (int)(Math.random() * (b - a));
        int min = Math.min(m, Math.min(n, o)); 
    System.out.println(m);
    System.out.println(n);
    System.out.println(o);
        System.out.println("The minimal generated number was " + min); 
    }
}
