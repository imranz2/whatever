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
        if (x2-x1 == 0){
            return "y = " + (y2-y1);
        }
        if (y2-y1 == 0){
            return "y = " + yIntercept();
        }
        if (y2-y1 == 0 && x2-x1 == 0) {
            return "y = 0";
        }
        return "y= " + (y2-y1) + "/" + (x2-x1) + "x + " + yIntercept();
    }


    public String coordinateForX(double x){
   /*    int first = y2-y1;
       int second = x2-x1;
       double done = (double)first/second;
       done = done * x;
       double slope = (double) (y2 - y1) / (x2-x1);
       double plug = y1 - slope*(x1);
       plug = (double) Math.round(plug * 100) / 100;
       done = done + plug; */
        double done = slope() * x;
        done = done + yIntercept();
        System.out.println("");
        return "(" + x + ", " + done + ")";

    }


}
