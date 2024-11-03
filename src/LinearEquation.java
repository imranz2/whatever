public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int xVal = 0;
    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double distance(){
        double side1 = (double)y2-y1;
        double side2 = (double)x2-x1;
        double distance = Math.sqrt(Math.pow(side1, 2)+ Math.pow(side2, 2));
        distance = (double) Math.round(distance * 100) / 100;
        return distance;


    }


    public double yIntercept(){
        double slope = (double) (y2 - y1) / (x2-x1);
        double plug = y1 - slope*(x1);
        plug = Math.round(plug * 100);
        plug = (double)plug/100;
        return plug;
    }


    public double slope(){
        int first = y2-y1;
        int second = x2-x1;
        double slope = (double)first/second;
        slope = Math.round(slope * 100);
        slope = (double)slope/100;
        return slope;
    }

    public String equation() {
        String str = "";
        String yIntStr = "";
        int theY = (y2 - y1);
        int theX = (x2 - x1);
        double slope = slope();
        double yInt = yIntercept();

        if (theX == 0) {
            return "x = " + x1;  // Vertical line
        }
        if (theY == 0) {
            return "y = " + Math.round(yInt * 100.0) / 100.0;  // Horizontal line, round yInt
        }
        if (slope == 1) {
            str = "y = x";
        } else if (slope == -1) {
            str = "y = -x";
        } else if (theY % theX == 0) {
            int wholeSlope = theY / theX;
            str = "y = " + wholeSlope + "x";
        } else {
            if (theX < 0) {
                theY = -theY;
                theX = -theX;
            }
            str = "y = " + theY + "/" + theX + "x";
        }
        if (yInt < 0) {
            yIntStr = " - " + Math.abs(Math.round(yInt * 100.0) / 100.0); // Round yInt
        } else if (yInt > 0) {
            yIntStr = " + " + Math.round(yInt * 100.0) / 100.0; // Round yInt
        }
        return str + yIntStr;
    }


    public String coordinateForX(double x){
        double done = slope() * x;
        done = done + yIntercept();
        System.out.println("");
        return "(" + x + ", " + done + ")";
    }

    public String lineInfo(){
        String str = "";
        str = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2+")\n";
        str += "The equation of the line between these points is: " + equation() + "\n";
        str += "The y-intercept of the line is: " + yIntercept() + "\n";
        str += "The slope of this line is: " + slope() + "\n";
        str += "The distance between the two points is: " + distance();
        return str;
    }
}
