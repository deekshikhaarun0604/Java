class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class GradeCheck {


    public static void checkGrade(int marks) throws InvalidGradeException {
        if (marks > 100) {
            throw new InvalidGradeException("Invalid grade! Marks cannot exceed 100.");
        } else if (marks < 0) {
            throw new InvalidGradeException("Invalid grade! Marks cannot be negative.");
        } else {
            System.out.println("Valid marks entered: " + marks);
        }
    }

    public static void main(String[] args) {

        try {
            int marks = 120; 
            checkGrade(marks);
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
