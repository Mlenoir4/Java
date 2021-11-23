package formes;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Cercle MonCercle = new Cercle(new Coordonnee(1, 1), 1);
            System.out.println(MonCercle.surface());
            Carre MonCarre = new Carre(new Coordonnee(1, 1), 0);
            System.out.println(MonCarre.surface());
            Rectangle MonRectangle = new Rectangle(new Coordonnee(1, 1), 1, 1);
            System.out.println(MonRectangle.surface());
            Segment MonSegment = new Segment(new Coordonnee(1, 1), 1);
            System.out.println(MonSegment.longueur);
        } catch (NegatifNumber test) {
            System.out.println(test.getMessage());
        }
    }
}
