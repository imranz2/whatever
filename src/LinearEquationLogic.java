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
            if (x1 == x2){
                System.out.println("These points are on a vertical line: x = " + x1);
            } else {
                LinearEquation LE = new LinearEquation(x1, y1, x2, y2);
                System.out.println(LE.lineInfo());
                System.out.println("");
                System.out.print("Enter a value for x: ");
                double somePoint = scan.nextDouble();
                scan.nextLine();
                System.out.println("The point on the line is " + LE.coordinateForX(somePoint));
            }
                System.out.println("");
                quit = promptContinue(scan);
        }
        System.out.println("");
        System.out.println("Thank you for using the slope calculator, goodbye!");
        return "";
    }

    private String promptContinue(Scanner scan){
        System.out.print("Would you like to enter another pair of coordinates? y/n: ");
        String done = scan.nextLine();
        return done;
    }

}