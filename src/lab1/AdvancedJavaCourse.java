package lab1;



/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends Courses {
    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits, prerequisites);
    }
}

//    public AdvancedJavaCourse(String courseName, String courseNumber) {
//        this.setCourseName(courseName);
//        this.setCourseNumber(courseNumber);
//    }



//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }



//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }


//    public void setPrerequisites(String prerequisites) {
//        if (prerequisites == null || prerequisites.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: prerequisites cannot be null of empty string");
//            System.exit(0);
//        }
//        this.prerequisites = prerequisites;
//    }
//
//    public void setCredits(double credits) {
//        if (credits < 0.5 || credits > 4.0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
//        }
//        this.setCredits(credits);
//    }


