package formes;

public class Cercle extends Point{

    Integer rayon;

    public Cercle(Coordonnee c1, Integer rayon) throws Exception {
        super(c1);
        this.rayon = rayon;
        if (this.rayon <= 0) {
            throw new Exception("Rayon negatif....");
        }
    }

    @Override
    public Double surface() {
        return Math.PI * rayon * rayon;

    }

    @Override
    public Double perimeter() {
        return 2* Math.PI* rayon;
    }
}
