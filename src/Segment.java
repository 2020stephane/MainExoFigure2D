public class Segment {

    protected Point ptSegDeb;
    protected Point ptSegFin;


    public Segment() { }
    public Segment(Point ptSegDeb, Point ptSegFin) {
        this.ptSegDeb = ptSegDeb;
        this.ptSegFin = ptSegFin;
    }

    //public void translate(int x, int y) { }
    public  void dessine(int i) {
        System.out.println("segment"+ i + "->" + ptSegDeb.getName() + ":" + ptSegDeb.getX() +
                ";" + ptSegDeb.getY() + "  " + ptSegFin.getName() + ":" + ptSegFin.getX() +
                ";" + ptSegFin.getY());
    }
}
