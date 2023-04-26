package lab2;
/**
 The IntroJavaCourse class represents an introductory java course that teaches basic java programming concepts and techniques.
 This class extends the abstract Courses class and implements the Course interface to define specific values for the course name, course number, credits, and prerequisites.
 This class is responsible for:
 Defining the specific properties and behavior of an Intro Java course, including its name, number, credits, and prerequisites
 Ensuring that the course information is accurately represented and can be accessed through getter methods
 Providing a standardized way to represent Intro Java courses in the application
 This class collaborates with the abstract Courses class and the Course interface to ensure that it follows the conventions and requirements for all courses in the application.
 @author Thomas Barrath
 @version 1.00
 */
public class IntroJavaCourse extends Courses implements Course {

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName,courseNumber,credits,prerequisites);
    }

    @Override
    public String getCourseName() {
        return "Introduction to Java";
    }

    @Override
    public String getCourseNumber() {
        return "158-108";
    }

    @Override
    public double getCredits() {
        return 3;
    }

    @Override
    public String getPrerequisites() {
        return "156-109";
    }

    @Override
    public String toString() {
        return "IntroJavaCourse{" +
                "courseName='" + getCourseName() + '\'' +
                ", courseNumber='" + getCourseNumber() + '\'' +
                ", credits=" + getCredits() +
                ", prerequisites='" + getPrerequisites() + '\'' +
                '}';
    }
}
