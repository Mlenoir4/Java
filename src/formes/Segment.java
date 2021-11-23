package formes;

public class Segment extends Point {

    Integer longueur;

    public Segment(Coordonnee c1, Integer longueur) throws Exception{
        super(c1);
        this.longueur= longueur;
        if (longueur <= 0)
            throw new NegatifNumber("Premiere longeur negative !");
    }

    public Coordonnee calculCoordonnee2(){
       Integer x2=  super.c1.x +longueur;
       return new Coordonnee(x2,super.c1.y);
    }
}
