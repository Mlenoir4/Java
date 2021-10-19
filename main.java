class Main
{
    String immatriculation;
    String modele;
    int prixArgus;
    int kilometrage;
    int dateDeMiseEnService;
    int cylindre;
    int carburant;
    String etat;
    String[] defauts;
    String[] options;
    float vitesse;

    public static void main (String[]args)
    {
        System.out.println("Mouais");
    }
    Main (int carburant)
    {
        this.carburant = carburant;
    }
    void rouler ()
    {
        this.kilometrage += this.vitesse;
        this.carburant -= this.vitesse;
        if (this.kilometrage > 100000)
            this.prixArgus -= 1000;
        if (this.carburant <= 0)
            System.out.println ("Plus de carburant");
    }

    void accelerer ()
    {
        this.vitesse++;
    }

    void decelerer ()
    {
        if (this.vitesse > 0)
            this.vitesse--;
    }
    Main test = new Main(100);
}
