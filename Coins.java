/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
    public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int quarter = 25;
    int y = a / quarter;
    int w = a % quarter;
    
    System.out.println("Use " + y + " quarters and " + w + " cents");
    }
}
