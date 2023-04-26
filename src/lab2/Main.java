package lab2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();

           IntroJavaCourse introJava = new IntroJavaCourse("Introduction to Java", "158-108", 3, "156-109");
           AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "172-107", 3, "156-109, 158-108");
           IntroToProgrammingCourse introToProgramming = new IntroToProgrammingCourse("Intro to Programming", "156-109", 3, "None" );

            courseList.add(introJava);
            courseList.add(advancedJava);
            courseList.add(introToProgramming);

        for (Course course : courseList) {
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Course Number: " + course.getCourseNumber());
            System.out.println("Credits: " + course.getCredits());
            System.out.println("Prerequisites: " + course.getPrerequisites() + "\n");
        }
    }
}
