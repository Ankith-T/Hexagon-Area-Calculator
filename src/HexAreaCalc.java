import java.util.Scanner;
public class HexAreaCalc {
    public static void main(String[] args) throws Exception {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter Length of side: ");
        double hexSideLength = inputScanner.nextDouble();

        hexSideLength = (6 * Math.pow(hexSideLength, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The Area of the Hexagon is " + hexSideLength);


    }
}
