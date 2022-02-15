
public class Rectangle extends Figure{


    private double width;
    private double height;

    public Rectangle(Segment seg1, Segment seg2, Segment seg3, Segment seg4) {
        seg = new Segment[4];
        seg[0] = new Segment(seg1.ptSegDeb, seg1.ptSegFin);
        seg[1] = new Segment(seg2.ptSegDeb, seg2.ptSegFin);
        seg[2] = new Segment(seg3.ptSegDeb, seg3.ptSegFin);
        seg[3] = new Segment(seg4.ptSegDeb, seg4.ptSegFin);
    }
    public Rectangle(Point pt1, Point pt2, Point pt3, Point pt4) { }
    public Rectangle(Point pt1, int x, int y) { }

    @Override
    public double getSurface() {

        width = (seg[0].ptSegFin.getX() - seg[0].ptSegDeb.getX());
        height = (seg[1].ptSegFin.getY() - seg[1].ptSegDeb.getY());
        return (width * height);
    }

    @Override
    public void seDessiner() {
        System.out.println("dessin d'un rectangle :");
        seg[0].dessine(1);
        seg[1].dessine(2);
        seg[2].dessine(3);
        seg[3].dessine(4);
    }

    @Override
    public void translate(int x, int y) {

        seg[0].ptSegDeb.setX( seg[0].ptSegDeb.getX() +x);
        seg[0].ptSegDeb.setY( seg[0].ptSegDeb.getY() +y);
        seg[1].ptSegDeb.setX( seg[1].ptSegDeb.getX() +x);
        seg[1].ptSegDeb.setY( seg[1].ptSegDeb.getY() +y);
        seg[2].ptSegFin.setX( seg[2].ptSegFin.getX() +x);
        seg[2].ptSegFin.setY( seg[2].ptSegFin.getY() +y);
        seg[3].ptSegFin.setX( seg[2].ptSegFin.getX() +x);
        seg[3].ptSegFin.setY( seg[2].ptSegFin.getY() +y);

    }
}
