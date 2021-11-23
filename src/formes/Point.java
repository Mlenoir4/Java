package formes;

public class Point {

    Coordonnee c1;

    public Double surface(){
        return null;
    }
    public Double perimeter(){
        return null;
    }

    public Point(Coordonnee c1) throws Exception{
        this.c1 = c1;
        if(c1.x < 0 || c1.y < 0){
            throw new NegatifNumber("Coordonee negatif !");
        }
    }
}

