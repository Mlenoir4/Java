import java.util.Arrays;
import java.util.List;

public class Zoo {

    public String name;
    public int nbrAnimal;
    public List<Animal> listeAnimal;

    public Zoo(String name, int nbrAnimal, List<Animal> listeAnimal) {
        this.name = name;
        this.nbrAnimal = nbrAnimal;
        this.listeAnimal = listeAnimal;

    }

    public static void main (String[]args)
    {
        Animal Elephant = new Animal("Dumbo", 3, 20, 22,"PSHHHHHH",1000, true);
        Animal Tigre = new Animal("Tigrou", 1, 20, 22,"GRAOU",1000, true);
        Animal Singe = new Animal("XxTerminator69xX", 3, 20, 22,"OUOUOU",1000, true);
        Animal Giraffe = new Animal("GrandKou", 10, 5, 22,".......",1000, true);
        Animal YasuoPlayer = new Animal("YasuoPlayer", 2, 12, 16,"REPORT JUNGLER",55, true);
        List<Animal> Animals = Arrays.asList(Elephant, Tigre, Singe, Giraffe, YasuoPlayer);

       Zoo Madagascar = new Zoo("Madagascar", 5, Animals);
    }
}
