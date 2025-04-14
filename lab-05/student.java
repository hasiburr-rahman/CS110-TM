package packageforUniManagement;

import java.util.ArrayList;

public class student {
    private int stdId;
    private String stdName;
    private double stdcgpa;
    ArrayList<course> coursesList = new ArrayList<course>();

    student(){

    }

    student(int stdid, String stdname, double cgpa){
        setStdId(stdid);
        setStdName(stdname);
        setStdcgpa(cgpa);
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public double getStdcgpa() {
        return stdcgpa;
    }

    public void setStdcgpa(double stdcgpa) {
        this.stdcgpa = stdcgpa;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void display(){
        System.out.println("Student Id: " + stdId + " -- Student Name: " + stdName + " -- CGPA: " + stdcgpa);
    }

    public void Addcourse(course c){
        coursesList.add(c);
    }

    public void DropCourse(String cId){
        for (int i=0; i < coursesList.size(); i++){
            if (coursesList.get(i).getCourseId().equals(cId)){
                coursesList.remove(i);
                break;
            }
        }
    }

    public void printCourse(){
        for (int i=0; i<coursesList.size(); i++){
            coursesList.get(i).cDispplay();
        }
    }

    public boolean isEnrolledIn(String courseId, ArrayList<course> course) {
        for (course c : course) {
            if (c.getCourseId().equals(courseId)) {
                return true;
            }
        }
        return false;
    }

}
