
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
    public double distance(Point pt) {

        //double d = Math.sqrt( Math.pow((pt.getX() - this.getX()),2) + Math.pow((pt.getY() - this.getY()),2) );
        double d = Math.sqrt( (  (pt.getX() - this.getX()) * (pt.getX() - this.getX()) ) +
                ((pt.getY() - this.getY()) * (pt.getY() - this.getY()) ) );
        return d;
    }


    public  String getName() {
        return name;
    }

}
