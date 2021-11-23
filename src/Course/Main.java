package Course;

public class Main {
    public static void main(String[] args){
        if(args[0].equals("2d"))
        {
            Course2D course2D = new Course2D();
            course2D.demarerLaCourse();
        }
        else if (args[0].equals("1d"))
            System.out.println("1d");
        else
            System.out.println("Erreur d'argument !");

    }
}
