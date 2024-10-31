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
        plug = (double) Math.round(plug * 100) / 100;
        return plug;
    }


    public double slope(){
        int first = y2-y1;
        int second = x2-x1;
        return (double)first/second;
    }


    public String equation(){
 /*       String str = "";
        if (yIntercept() == 0){
            return "y = " + (y2-y1)/(x2-x1) + "x";
        }
        if (slope() == 0 && yIntercept() == 0){
            return "y = 0";
        }
        if ((x2-x1) < 0 && (y2-y1) < 0){
            str = "y = " + Math.abs(y2-y1) + "/" + Math.abs(x2-x1) + "x ";
        }
        if (x2-x1 == 0){
            return "y = " + (y2-y1);
        }
        if (y2-y1 == 0){
            return "y = " + yIntercept();
        }
        if (y2-y1 == 0 && x2-x1 == 0) {
            return "y = 0";
        }
        if ((y2-y1)/(x2-x1) == 1){
            str =  "y = x " ;
        }
        if ((y2-y1)/(x2-x1) == -1){
            str = "y = -x ";
        }
        if ((x2-x1) < 0){
            return "y = -" + Math.abs(y2-y1) + "/" + Math.abs(x2-x1) + "x ";
        }
        if ((double)(y2-y1)/(x2-x1) % 1 == 0){
            str = "y = " + (y2-y1)/(x2-x1) + "x ";
        }
        if (yIntercept() < 0){
            str += "-" + Math.abs(yIntercept());
        } else { */
            return "y = " + (y2-y1) + "/" + (x2-x1) + "x + " + yIntercept();
       /* } */
       /* return str; */
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
