public class Questions {

    String questionText;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    char correctAnswer;

    public Questions(String questionText,
                    String optionA,
                    String optionB,
                    String optionC,
                    String optionD,
                    char correctAnswer) {

        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = Character.toUpperCase(correctAnswer);
    }

    public void displayQuestion() {
        System.out.println("\n" + questionText);
        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
    }

    public boolean checkAnswer(char userAnswer) {
        return Character.toUpperCase(userAnswer) == correctAnswer;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }
}