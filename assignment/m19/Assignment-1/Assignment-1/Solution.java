import java.util.Scanner;
/**.
 * Solution class for code-eval.
 */
import java.util.ArrayList;
/**
 * . using ArrayList.
 */
class Quiz {

    String correctGuess;
    /**
     * { correctGuess }
     */
    String penalityMarks;
    /**
     * { penalityMarks }
     */
    String maxMarks;
    /**
     * { maxMarks }
     */
    String question;
    /**
     * { question }
     */
    String[] choices;
    /**
     * Constructs the object.
     */

    /**
     * Constructs the object.
     */
    Quiz() {

    }

    /**
     * Constructs the object.
     *
     * @param      question       The question
     * @param      choices        The choices
     * @param      correctGuess   The correct guess
     * @param      maxMarks       The maximum marks
     * @param      penalityMarks  The penality marks
     */
    Quiz(String question, String[] choices, String correctGuess, String maxMarks, String penalityMarks) {
        this.question = question;
        this.choices = choices;
        this.correctGuess = correctGuess;
        this.maxMarks = maxMarks;
        this.penalityMarks = penalityMarks;
    }   
    
}   
public final class Solution {
    static ArrayList<String> answersAttempted = new ArrayList<String>();
    /**
     * { var_description }
     */
    static ArrayList<Quiz> quizCompetition = new ArrayList<Quiz>();
    /**
     * { item_description }
     */
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                //System.out.println(tokens[1]);
                loadQuestions(s, q, Integer.parseInt(tokens[1]));

                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        try {
            while(questionCount > 0) {
                String line = s.nextLine();
                String[] tokens = line.split(":");
                String[] choices = tokens[1].split(",");
                if(tokens[0].equals("")){
                    System.out.println("Error! Malformed question");
                    return;
                }
                if(choices.length <= 1) {
                    System.out.println("trick question does not have enough answer choices");
                    return;
                }
                if(Integer.parseInt(tokens[3]) < 0) {
                    System.out.println("Invalid max marks for question about sony");
                    return;
                }
                if(Integer.parseInt(tokens[4]) > 0) {
                    System.out.println
                    ("Invalid penalty for question about sony");
                    return;
                }
                if(!tokens[2].equals("1") && !tokens[2].equals("2") && !tokens[2].equals("3") && !tokens[2].equals("4")) {
                    System.out.println
                    ("Error! Correct answer choice number is out of range for question text 1");
                    return;
                }

                Quiz q = new Quiz(tokens[0],choices,tokens[2],tokens[3],tokens[4]);
                quizCompetition.add(q);
                questionCount--;
            }
            if(quizCompetition.size() != 0) {
                System.out.println(quizCompetition.size() + " are added to the quiz");
            }else {
                System.out.println("Quiz does not have questions");
            }
        } catch(Exception e) {
            System.out.println("Error! Malformed question");
        }
    }
    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object

        for(int i = 0; i < quizCompetition.size(); i++) {
            System.out.println(quizCompetition.get(i).question + "(" + quizCompetition.get(i).maxMarks + ")");
            for(int j = 0; j < quizCompetition.get(i).choices.length; j++) {
                System.out.print(quizCompetition.get(i).choices[j]);
                System.out.print("    ");
            }
            System.out.println();
            System.out.println();
        }
        while(answerCount > 0) {
            String line = s.nextLine();
            String[] newtoken = line.split(" ");
            if(newtoken[1].equals("a")) {
                newtoken[1] = "1";
            } else if (newtoken[1].equals("b") ) {
                newtoken[1] = "2";
            } else if (newtoken[1].equals("c")) {
                newtoken[1] = "3";
            }else if (newtoken[1].equals("d")) {
                newtoken[1] = "4";
            } 
            answersAttempted.add(newtoken[1]);
            answerCount--;
        }
    }

    /**
     * Displays the score report
     *
     * @param      quiz  The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
        int finalScore = 0;
        for(int i = 0; i < quizCompetition.size(); i++) {
            System.out.println(quizCompetition.get(i).question);
                if(answersAttempted.get(i).equals(quizCompetition.get(i).correctGuess)) {
                    System.out.println(" Correct Answer! - Marks Awarded: " + quizCompetition.get(i).maxMarks);
                    finalScore += Integer.parseInt(quizCompetition.get(i).maxMarks);
                } else {
                    System.out.println(" Wrong Answer! - Penalty: " + quizCompetition.get(i).penalityMarks);
                    finalScore += Integer.parseInt(quizCompetition.get(i).penalityMarks);
                    
                }
    }
    if (quizCompetition.size() != 0) {
        System.out.println("Total Score: " + finalScore );
    }
    }
}
