
public class TriangleRect extends Figure {

    double base;
    double hauteur;

    TriangleRect(Segment seg1, Segment seg2, Segment seg3) {

        segment1 = new Segment(seg1.ptSegDeb, seg1.ptSegFin);
        segment2 = new Segment(seg2.ptSegDeb, seg2.ptSegFin);
        segment3 = new Segment(seg3.ptSegDeb, seg3.ptSegFin);
    }

    @Override
    public double getSurface() {
        System.out.print("Triangle : ");
        base = (segment1.ptSegFin.getX() - segment1.ptSegDeb.getX());
        hauteur = (segment2.ptSegFin.getY() - segment2.ptSegDeb.getY());
        return ((base * hauteur) / 2);
    }

    @Override
    public void seDessiner() {
        System.out.println("dessin d'un triangle :");
        segment1.dessine(1);
        segment2.dessine(2);
        segment3.dessine(3);
    }
    @Override
    public void translate(int x, int y) {
        segment1.ptSegDeb.setX( segment1.ptSegDeb.getX() +1);
        segment1.ptSegDeb.setY( segment1.ptSegDeb.getY() +1);
        segment2.ptSegFin.setX( segment2.ptSegFin.getX() +1);
        segment2.ptSegFin.setY( segment2.ptSegFin.getY() +1);
        segment3.ptSegDeb.setX( segment3.ptSegDeb.getX() +1);
        segment3.ptSegDeb.setY( segment3.ptSegDeb.getY() +1);

    }
}
