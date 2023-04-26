package lab2;
/**
 The IntroToProgrammingCourse class represents an introductory programming course that teaches basic programming concepts and techniques.
 This class extends the abstract Courses class and implements the Course interface to define specific values for the course name, course number, credits, and prerequisites.
 This class is responsible for:
 Defining the specific properties and behavior of an Intro to Programming course, including its name, number, credits, and prerequisites
 Ensuring that the course information is accurately represented and can be accessed through getter methods
 Providing a standardized way to represent Intro to Programming courses in the application
 This class collaborates with the abstract Courses class and the Course interface to ensure that it follows the conventions and requirements for all courses in the application.
 @author Thomas Barrath
 @version 1.00
 */
public class IntroToProgrammingCourse extends Courses implements Course {

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName,courseNumber,credits,prerequisites);
    }

    @Override
    public String getCourseName() {
        return "Introduction to Programming";
    }

    @Override
    public String getCourseNumber() {
        return "156-109";
    }

    @Override
    public double getCredits() {

        return 3;
    }

    @Override
    public String getPrerequisites() {
        return "None";
    }

    @Override
    public String toString() {
        return "IntroToProgrammingCourse{" +
                "courseName='" + getCourseName() + '\'' +
                ", courseNumber='" + getCourseNumber() + '\'' +
                ", credits=" + getCredits() +
                ", prerequisites='" + getPrerequisites() + '\'' +
                '}';
    }
}
