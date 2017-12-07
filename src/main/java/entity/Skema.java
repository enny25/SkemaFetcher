package entity;

import java.util.ArrayList;

public class Skema {

    private ArrayList<Course> courses = new ArrayList();

    public Skema() {
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    } 
    
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    public ArrayList<Course> getCoursesOfWeek(){
        ArrayList<Course> coursesOfWeek = new ArrayList<Course>();
       int i = courses.get(0).numericalDayOfWeek();
       coursesOfWeek.add(courses.get(0));
        System.out.println(courses.get(0).toString());
       int x = 1;
       
       while(i != courses.get(x).numericalDayOfWeek()){
           System.out.println("here: " + courses.get(x).numericalDayOfWeek());
           coursesOfWeek.add(courses.get(x));
           System.out.println(courses.get(x).toString());
           x++;
           
       }
        return coursesOfWeek;
    }
}
