
public class Rectangle extends Figure{


    private double width;
    private double height;

    public Rectangle(Segment seg1, Segment seg2, Segment seg3, Segment seg4) {
        segment1 = new Segment(seg1.ptSegDeb, seg1.ptSegFin);
        segment2 = new Segment(seg2.ptSegDeb, seg2.ptSegFin);
        segment3 = new Segment(seg3.ptSegDeb, seg3.ptSegFin);
        segment4 = new Segment(seg4.ptSegDeb, seg4.ptSegFin);
    }
    public Rectangle(Point pt1, Point pt2, Point pt3, Point pt4) { }
    public Rectangle(Point pt1, int x, int y) { }

    @Override
    public double getSurface() {
        return 0;
    }

    @Override
    public void seDessiner() {
        System.out.println("dessin d'un rectangle :");
        segment1.dessine(1);
        segment2.dessine(2);
        segment3.dessine(3);
        segment4.dessine(4);
    }

    @Override
    public void translate(int x, int y) {

        segment1.ptSegDeb.setX( segment1.ptSegDeb.getX() +1);
        segment1.ptSegDeb.setY( segment1.ptSegDeb.getY() +1);
        segment2.ptSegDeb.setX( segment2.ptSegDeb.getX() +1);
        segment2.ptSegDeb.setY( segment2.ptSegDeb.getY() +1);
        segment3.ptSegFin.setX( segment3.ptSegFin.getX() +1);
        segment3.ptSegFin.setY( segment3.ptSegFin.getY() +1);
        segment4.ptSegFin.setX( segment3.ptSegFin.getX() +1);
        segment4.ptSegFin.setY( segment3.ptSegFin.getY() +1);

    }
}
