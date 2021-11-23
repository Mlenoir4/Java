package mammifere;

public class Enseignant extends Humain{

    public Enseignant(String name) {
        this.name = name;
    }

    String name;

    public void presentationEnseignant() {
        System.out.println(presentationHumain() + "Enseignant " + this.name);
    }
}
