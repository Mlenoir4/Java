package Quiz;

public class Main {
    public static void main(String[] args){
        try {
            Quiz quiz = new Quiz();
            quiz.startQuiz();
        } catch (Exception test) {
            System.err.println("Error: " + test.getMessage());
        }
    }
}
