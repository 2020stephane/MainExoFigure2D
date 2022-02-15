
public class TriangleRect extends Figure {

    double base;
    double hauteur;

    TriangleRect(Segment seg1, Segment seg2, Segment seg3) {

        seg = new Segment[3];
        seg[0] = new Segment(seg1.ptSegDeb, seg1.ptSegFin);
        seg[1] =  new Segment(seg2.ptSegDeb, seg2.ptSegFin);
        seg[2] =  new Segment(seg3.ptSegDeb, seg3.ptSegFin);
    }

    @Override
    public double getSurface() {

        base = (seg[0].ptSegFin.getX() - seg[0].ptSegDeb.getX());
        hauteur = (seg[1].ptSegFin.getY() - seg[1].ptSegDeb.getY());
        return ((base * hauteur) / 2);
    }

    @Override
    public void seDessiner() {
        System.out.println("dessin d'un triangle :");
        seg[0].dessine(1);
        seg[1].dessine(2);
        seg[2].dessine(3);
    }
    @Override
    public void translate(int x, int y) {
        seg[0].ptSegDeb.setX(  seg[0].ptSegDeb.getX() +x);
        seg[0].ptSegDeb.setY(  seg[0].ptSegDeb.getY() +y);
        seg[1].ptSegFin.setX( seg[1].ptSegFin.getX() +x);
        seg[1].ptSegFin.setY( seg[1].ptSegFin.getY() +y);
        seg[2].ptSegDeb.setX( seg[2].ptSegDeb.getX() +x);
        seg[2].ptSegDeb.setY( seg[2].ptSegDeb.getY() +y);

    }
}
