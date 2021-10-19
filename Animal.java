public class Animal {
    public String name;
    public int taille;
    public int age;
    public int dureeDeVie;
    public String crie;
    public int poids;
    public boolean espece;

    public Animal(String name, int taille, int age, int dureeDeVie, String crie, int poids, boolean espece) {
        this.name = name;
        this.taille = taille;
        this.age = age;
        this.dureeDeVie = dureeDeVie;
        this.crie = crie;
        this.poids = poids;
        this.espece = espece;
    }

    public static void main(String[] args)
    {
        Animal Elephant = new Animal("Dumbo", 3, 20, 22,"PSHHHHHH",1000, true);
        Elephant.modifierCrie("AZERTY");
        while (Elephant.age <= Elephant.dureeDeVie) {
            Elephant.crier();
            Elephant.veillir();
    }

    }
    public void veillir(){
        if (this.age >= this.dureeDeVie) {
            System.out.println(this.name + " est mort...");
            this.age++;
        }
        else
            this.age++;
    }

   public void crier(){
        System.out.println(this.crie);
    }
    public String modifierCrie(String newCrie){
        return this.crie = newCrie;
    }
    public void mort(){

    }
}
