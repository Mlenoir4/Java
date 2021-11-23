package formes;

public class Carre extends Segment{

    public Carre(Coordonnee c1, Integer longueur) throws Exception {
        super(c1, longueur);
    }

    public Coordonnee calculCoordonnee3(){
        return new Coordonnee(super.c1.x,super.c1.y+longueur);
    }

    public Coordonnee calculCoordonnee4(){
        return new Coordonnee(super.c1.x+longueur,super.c1.y+longueur);
    }

    @Override
    public Double surface() {
        super.surface();
        return Double.valueOf(longueur*longueur);

    }
    @Override
    public Double perimeter() {
        return Double.valueOf(4*longueur);
    }
}
