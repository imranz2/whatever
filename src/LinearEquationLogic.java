import java.util.Scanner;


public class LinearEquationLogic {


    public String start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the linear equation calculator!");
        String quit = "";
        while (!quit.equals("n")){
            System.out.print("Enter coordinate 1: ");
            String c1 = scan.nextLine();
            System.out.print("Enter coordinate 2: ");
            String c2 = scan.nextLine();
            int comma1 = c1.indexOf(" ");
            int comma2 = c2.indexOf(" ");
            int l1 = c1.length();
            int y1 = Integer.parseInt(c1.substring(comma1 + 1, l1 - 1));
            int y2 = Integer.parseInt(c2.substring(comma2 + 1, c2.length() - 1));
            int x1 = Integer.parseInt(c1.substring(1, comma1 - 1));
            int x2 = Integer.parseInt(c2.substring(1, comma2 - 1));
            System.out.println("");
            LinearEquation LE = new LinearEquation(x1, y1, x2, y2);
            System.out.println("The two points are: " +c1 + " and " + c2);
            System.out.println("The equation of the line between these points is: " + LE.equation());
            System.out.println("The y-intercept of the line is: " + LE.yIntercept());
            System.out.println("The slope of this line is: " + LE.slope());
            System.out.println("The distance between the two points is: " + LE.distance());
            System.out.println("");
            System.out.print("Enter a value for x: ");
            double somePoint = scan.nextDouble();
            scan.nextLine();
            System.out.println("");
            System.out.println("The point on the line is " + LE.coordinateForX(somePoint));
            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            String done = scan.nextLine();
            quit = done;
        }
        System.out.println("");
        System.out.println("Thank you for using the slope calculator, goodbye!");
        System.out.println("");


        return "";
    }
}
