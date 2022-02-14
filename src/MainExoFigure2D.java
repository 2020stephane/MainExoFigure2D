/**
 ** Copyright (c) 2022.
 ** Auteur  : S.Brisse
 ** Version : 1.0
 ** IDE     : INTELLIJ
 **/

public class MainExoFigure2D {

    public static void main(String[] args){

        Point ptTriRectEnCePt = new Point(0,0,"A");
        Point ptTriSurAbcisse = new Point(2,0,"B");
        Point ptTriSurOrdonne = new Point(0,2,"C");

        Segment Base = new Segment( ptTriRectEnCePt, ptTriSurAbcisse);
        Segment AjdacentVert = new Segment( ptTriRectEnCePt, ptTriSurOrdonne);
        Segment Hypotenus = new Segment( ptTriSurAbcisse, ptTriSurOrdonne);

        TriangleRect monTriangle = new TriangleRect(Base, AjdacentVert, Hypotenus);


        Point ptLeftDown = new Point( 0 , 0, "W" ) ;
        Point ptRightDown = new Point( 3 , 0, "X" ) ;
        Point ptRightUp = new Point( 3 , 2, "Y" ) ;
        Point ptLeftUp = new Point( 0 , 2, "Z" ) ;

        Segment HorztDown = new Segment (ptLeftDown, ptRightDown);
        Segment HorztUp = new Segment (ptLeftUp, ptRightUp);
        Segment LeftVert = new Segment (ptLeftDown, ptLeftUp);
        Segment RightVert = new Segment (ptRightDown, ptRightUp);

        Rectangle monRect = new Rectangle(HorztDown, RightVert, HorztUp , LeftVert) ;


        Figure[] figure = { monTriangle, monRect } ;
        for( int i = 0; i < figure.length; i++ ){
            figure[i].seDessiner() ;
        }
        //i= 0;
        System.out.println("deplacement de x= x+1 y= y+1");
        for( int i = 0; i < figure.length; i++ ) {
            figure[i].translate(1, 1);
        }
        System.out.println("position apres deplacement" );
        for( int i = 0; i < figure.length; i++ ) {
            figure[i].seDessiner() ;
        }
        System.out.println("surface des figures " );
        for( int i = 0; i < figure.length; i++ ) {
            if (figure[i]  instanceof Rectangle) {
                System.out.print("Rectangle : ");
            } else {
                System.out.print("Triangle : ");
            }
            System.out.println(figure[i].getSurface());
        }
        if ( (monRect).isLargerThan(monTriangle) > 0)
            System.out.println("surface rectangle > surface triangle");
        if ( (monRect).isLargerThan(monTriangle) < 0)
            System.out.println("surface triangle > surface rectangle");
        System.out.println( ptLeftDown.distance(ptRightDown));

    }
}
