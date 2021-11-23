package mammifere;

public class Etudiant extends Humain{

    String name;

    public Etudiant(String name) {
        this.name = name;
    }

    public void presentationEtudiant() {
        System.out.println(presentationHumain() + "Etudiant " + this.name);
    }
}
