package lab2;
/**
 The AdvancedJavaCourse class represents an advanced-level course in Java programming that builds on the knowledge and skills learned in introductory programming courses.
 This class extends the abstract Courses class and implements the Course interface to define specific values for the course name, course number, credits, and prerequisites.
 This class is responsible for:
 Defining the specific properties and behavior of an Advanced Java course, including its name, number, credits, and prerequisites
 Ensuring that the course information is accurately represented and can be accessed through getter methods
 Providing a standardized way to represent Advanced Java courses in the application
 This class collaborates with the abstract Courses class and the Course interface to ensure that it follows the conventions and requirements for all courses in the application.
 @author BarrathTb
 @version 1.00
 */
public class AdvancedJavaCourse extends Courses implements Course {

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName,courseNumber,credits,prerequisites);
    }

    @Override
    public String getCourseName() {
        return "Advanced Java";
    }

    @Override
    public String getCourseNumber() {
        return "172-107";
    }

    @Override
    public double getCredits() {
        return 3;
    }

    @Override
    public String getPrerequisites() {
        return "156-109, 158-108";
    }

    @Override
    public String toString() {
        return "AdvancedJavaCourse{" +
                "courseName='" + getCourseName() + '\'' +
                ", courseNumber='" + getCourseNumber() + '\'' +
                ", credits=" + getCredits() +
                ", prerequisites='" + getPrerequisites() + '\'' +
                '}';
    }
}
