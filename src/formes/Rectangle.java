package formes;

public class Rectangle extends Carre{
    Integer longueur2;

    public Rectangle(Coordonnee c1, Integer longueur, Integer longeur2) throws Exception {
        super(c1, longueur);
        this.longueur2=longeur2;
        if (longueur2 <= 0)
            throw new Exception("2eme longueur negative !");

    }

    @Override
    public Coordonnee calculCoordonnee3() {
        return new Coordonnee(super.c1.x,super.c1.y+longueur2);
    }

    @Override
    public Coordonnee calculCoordonnee4() {
        return new Coordonnee(super.c1.x+longueur,super.c1.y+longueur2);

    }

    @Override
    public Double surface() {
        return Double.valueOf(longueur*longueur2);
    }

    @Override
    public Double perimeter() {
        return Double.valueOf(longueur*2+2*longueur2);
    }
}
