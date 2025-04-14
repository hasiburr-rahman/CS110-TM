
// I write all the code in IntelliJ IDE.

package packageforUniManagement;

import java.util.ArrayList;

   /*
     @author - Hasibur
    */


public class Main {
    public static void main(String[] args) {
        ArrayList<student> stu = new ArrayList<student>();
        ArrayList<course> cour = new ArrayList<course>();

        //adding students
        stu.add(new student(43, "Hasibur", 2.00));
        stu.add(new student(44, "Nishan", 3.99));
        stu.add(new student(45, "Sakib", 4.00));

        //adding courses
        cour.add(new course("110", "oop", 4.5));
        cour.add(new course("103", "SP", 4.5));
        cour.add(new course("106", "DM", 3.00));
        cour.add(new course("200", "ED", 1.00));

        //adding studeyts to courses.
        cour.get(0).Addstudent(stu.get(0));
        cour.get(0).Addstudent(stu.get(1));
        cour.get(0).Addstudent(stu.get(2));

        //adding courses to students.
        stu.get(0).Addcourse(cour.get(1));
        stu.get(1).Addcourse(cour.get(1));
        stu.get(2).Addcourse(cour.get(1));

        System.out.println("Before any changes:");

        System.out.println("\nAll Students:");
        for (student s : stu) {
            s.display();
            System.out.println("Enrolled courses:");
            s.printCourse();
            System.out.println();
        }

        System.out.println("\nAll Courses:");
        for (course c : cour) {
            c.cDispplay();
            System.out.println("Students enrolled:");
            c.printStdlist();
            System.out.println();
        }


        System.out.println("\nAfter changes:");

        String cid = "103";
        for (int i = 0; i < cour.size(); i++) {
            if (cour.get(i).getCourseId() == cid) {
                stu.get(1).DropCourse(cid);
            }
        }

        System.out.println("\nAll Students:");
        for (student s : stu) {
            s.display();
            System.out.println("Enrolled in the following courses:");
            s.printCourse();
            System.out.println();
        }

        for (course c : cour) {
            c.cDispplay();
            System.out.println("Students enrolled:");
            c.printStdlist();
            System.out.println();
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Here, Following steps are");
        System.out.println("a.Searching a Student\n" +
                "b. Searching a Course\n" +
                "c. Searching whether a student takes a course\n" +
                "d. Searching courses taken by a student");
        System.out.println();
        //Searching code, here I code for searching students whether he/she took any course or any course taken by them.
        searchStudent(stu, 44);
        searchCourse(cour, "103");
        isStudentEnrolledInCourse(stu, cour, 44, "103");
        getCoursesByStudent(stu, 43);

    }

    public static void searchStudent(ArrayList<student> stu, int stdId){
        for (student s : stu){
            if (s.getStdId() == stdId) {
                System.out.println("Found Student!!!");
                s.display();
                return;
            }
        }

        System.out.println("Student id With " + stdId + " NOT FOUND!");
    }

    public static void searchCourse(ArrayList<course> course, String courseId){
        for (course c : course){
            if (c.getCourseId().equalsIgnoreCase(courseId)){
                System.out.println("Course Found!!!");
                return;
            }
        }
        System.out.println("Course id with " + courseId + " NOT FOUND");
    }

    public static void isStudentEnrolledInCourse(ArrayList<student> stu, ArrayList<course> course, int stdid, String courseId){
        student stdfound = null;
        for (student s : stu){
            if (s.getStdId() == stdid){
                System.out.println("Yes, Student enrolled the course. Stu ID: " + stdid);
                stdfound = s;
                break;
            }
        }
        if (stdfound == null){
            System.out.println("NOT FOUND std ");
            return;
        }

        if (stdfound.isEnrolledIn(courseId, course)){
            System.out.println("YES, Student ID with " + stdid + " enrolled course ");
        }
        else {
            System.out.println("YES, Student ID with " + stdid + " not enrolled course ");
        }
    }

    public static void getCoursesByStudent(ArrayList<student> stu, int stdID){
        for (student s : stu) {
            if (s.getStdId() == stdID) {
                System.out.println("Courses taken by " + s.getStdName() + ":");
                s.printCourse();
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
