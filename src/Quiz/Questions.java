 package Quiz;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Questions {
    public String question;
    Reponse reponse;

    public Questions(String question, Reponse reponse) {
        this.question = question;
        this.reponse = reponse;
    }

    void afficherReponses()
    {
        System.out.println(this.reponse.reponse1);
        System.out.println(this.reponse.reponse2);
        System.out.println(this.reponse.reponse3);
        System.out.println(this.reponse.reponse4);
    }

    Boolean displayQuestions()
    {
        System.out.println(this.question);
        this.afficherReponses();
        System.out.println("Votre reponse: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(this.verifierReponse(str));
        return (parseInt(str) == this.reponse.bonneReponse);
    }

    String displayCorrectReponse(int index)
    {
        switch(index){
            case 1:
                return this.reponse.reponse1;
            case 2:
                return this.reponse.reponse2;
            case 3:
                return this.reponse.reponse3;
            case 4:
                return this.reponse.reponse4;
            default:
                return null;
        }
    }

    String verifierReponse(String reponse)
    {
        if (parseInt(reponse) == this.reponse.bonneReponse)
            return ("Correct !");
        else {
            System.out.println("La bonne reponse est " + displayCorrectReponse(this.reponse.bonneReponse));
            return ("Faux !");
        }
    }
}
