package lab2;



public interface Course {

    String getCourseName();
    String getCourseNumber();
    double getCredits();
    String getPrerequisites();

    void setCourseName(String courseName);
    void setCourseNumber(String courseNumber);
    void setCredits(double credits);
    void setPrerequisites(String prerequisites);

}