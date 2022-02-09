
public class Point {

    private int x;
    private int y;
    private String name;

    /**************************
     **     Constructors     **
     *************************/
    public Point() { }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }
    public Point(Point ptr){
        this.x = ptr.x;
        this.y = ptr.y;
    }
    /**************************
    **       Methodes       **
    **************************/

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public  String getName() {
        return name;
    }
    public double distance(Point pt) {
        double val = 0;
        return val;
    }
}
