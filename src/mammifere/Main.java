package mammifere;

public class Main {

    public static void main(String[] args) {
        Baleine MyBaleine = new Baleine("Mobi Dick");
        MyBaleine.presentationBaleine();
        Dauphin MyDauphin = new Dauphin("Ecco");
        MyDauphin.presentationDauphin();
        Etudiant MyEtudiant = new Etudiant("Raoul");
        MyEtudiant.presentationEtudiant();
        Enseignant MyEnseignant = new Enseignant("Mickael");
        MyEnseignant.presentationEnseignant();
    }
}
