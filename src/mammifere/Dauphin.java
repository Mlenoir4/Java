package mammifere;

public class Dauphin extends Cetace{

    public Dauphin(String name) {
        this.name = name;
    }

    String name;

    public void presentationDauphin() {
        System.out.println(presentationCetace() + "Dauphin "+ this.name);
    }
}
