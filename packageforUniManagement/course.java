package packageforUniManagement;

import java.util.ArrayList;

public class course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private int NumOfStd = 0;
    ArrayList<student> stdList = new ArrayList<student>();

    course(){

    }

    course(String courseId, String courseTitle, double credit){
        setCourseId(courseId);
        setCourseTitle(courseTitle);
        setCredit(credit);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void cDispplay(){
        System.out.println("Course ID: " + getCourseId() + " -- Course title: " + getCourseTitle() + " -- course credit " + getCredit());
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void Addstudent(student s){
        stdList.add(s);
        this.NumOfStd = stdList.size();
    }

    public void Dropstudnet(int stdId){
        for (int i=0; i<stdList.size(); i++){
            if (stdList.get(i).getStdId() == stdId){
                stdList.remove(i);
                break;
            }
        }
    }

    public void printStdlist(){
        for (int i=0; i<stdList.size(); i++){
            stdList.get(i).display();
        }
    }
}
