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
}
