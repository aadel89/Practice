public class ExamGrade {

    public static void main(String[] args) {

        // equivalence partitioning

            // valid equivalence partitions
            examGrade(12);
            examGrade(55);
            examGrade(73);
            examGrade(84);
            examGrade(97);

            //invalid equivalence partitions
            examGrade(-2);
            examGrade(102);
            //other options with black box technique: letters, special characters
            
        //2 points boundary value analyses
            examGrade(-1);
            examGrade(0);
            examGrade(54);

            examGrade(55);
            examGrade(64);

            examGrade(65);
            examGrade(74);

            examGrade(75);
            examGrade(84);

            examGrade(85);
            examGrade(100);

            examGrade(101);

    }

    public static void examGrade(int score) {

        if (score >= 0 && score < 55) {
            System.out.println("Your final score: " + score + ". You failed the exam.");
        } else if ( score >= 55 && score < 65) {
            System.out.println("Your final score: " + score + ". You passed the exam. Your garde is 2.");
        } else if (score >= 65 && score < 75) {
            System.out.println("Your final score: " + score + ". You passed the exam. Your garde is 3.");
        } else if (score >= 75 && score < 85) {
            System.out.println("Your final score: " + score + ". You passed the exam. Your garde is 4.");
        } else if (score >= 85 && score <= 100) {
            System.out.println("Your final score: " + score + ". You passed the exam. Your garde is 5.");
        } else {
            System.out.println("Invalid value");
        }
    }   
}