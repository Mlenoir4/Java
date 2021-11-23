package Quiz;

import java.util.ArrayList;

public class Quiz {

    ArrayList<Questions> questions;
    int score;
    public enum Prefixe {
        ZERO("0"),
        UN("1"),
        DEUX("2"),
        TROIS("3"),
        QUATRE("4"),
        CINQ("5"),
        SIX("6"),
        SEPT("7"),
        HUIT("8"),
        NEUF("9");
        public final String label;
        Prefixe(String label) {
            this.label = label;
        }
    }

    public Quiz() {
        this.questions = new ArrayList<>();
        questions.add(new Questions("Qui est Yasuo ?", new Reponse("1: Un Joueur", "2: Un Cancer", "3: Un Champion", "4: Je sais pas" , 3)));
        questions.add(new Questions("Quel est le personnage principal de SAO", new Reponse("1: Katarina", "2: Kirita", "3: Katarito", "4: Kirito" , 4)));
        questions.add(new Questions("Quelle est la races d'animaux de compagnie la plus connue ?", new Reponse("1: Un Chat", "2: Un Lion", "3: Une Giraffe", "4: C'est quoi un animal de compagnie ?" , 1)));
        questions.add(new Questions("Date de création de Java ?", new Reponse("1: 1990", "2: 1995", "3: 2000", "4: 2005" , 2)));
    }

    void startQuiz() throws Exception {
        int i = 1;
        for (Questions currentQuestion: this.questions) {
            System.out.println("Question N°"+ i++);
            if (currentQuestion.displayQuestions())
                score ++;
        }
        System.out.println("Votre score est de: " + score + " sur " + (i - 1));
    }
}
