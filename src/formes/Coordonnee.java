package formes;

public class Coordonnee {
    Integer x;
    Integer y;

    public Coordonnee(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x="+x+" y="+y;
    }
}
