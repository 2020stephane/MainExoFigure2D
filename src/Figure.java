
public abstract class Figure extends Segment implements IDrawable, IMoveable, ISurface{

    protected Segment segment1;
    protected Segment segment;
    protected Segment segment3;
    protected Segment segment4;
    protected Segment[] seg;

    public Figure() { }

    public Figure(Point pt1, Point pt2, Point pt3) {  }
    public Figure(Point pt1, Point pt2, Point pt3, Point pt4) { }
    public Figure(Segment segment1, Segment segment2) { }

    @Override
    public void seDessiner() {
        System.out.println("dessin d'un triangle :");
        dessine(0);
        dessine(1);
        dessine(2);
    }
}
