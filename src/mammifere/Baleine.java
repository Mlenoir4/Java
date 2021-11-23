package mammifere;

public class Baleine extends Cetace {

    public Baleine(String name) {
        this.name = name;
    }

    String name;
    public void presentationBaleine() {
        System.out.println(presentationCetace() +"Baleine " + this.name);
    }
}
