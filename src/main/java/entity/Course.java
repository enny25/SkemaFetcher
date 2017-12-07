package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.apache.xalan.lib.ExsltDatetime.date;

public class Course {
    private String startDate, startTime, endTime, courseId, room, teacher, courseName;

    public Course() {
    }

    public Course(String startDate, String startTime, String endTime, String courseId, String room, String teacher, String courseName) {
        this.startDate = startDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.courseId = courseId;
        this.room = room;
        this.teacher = teacher;
        this.courseName = courseName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" + "startDate=" + startDate + "\n" + ", startTime=" + startTime + "\n" + ", endTime=" + endTime + "\n" + ", courseId=" + courseId + "\n" + ", room=" + room + "\n" + ", teacher=" + teacher + "\n" + ", courseName=" + courseName + '}';
    }
    public String toCourseString(){
        String SkemaString = new String();
        String dayOfWeek = dayOfWeek();
        SkemaString = dayOfWeek+" "+startTime+"-"+endTime+" "+ courseName+"/n";
        return SkemaString;
    }
    public String dayOfWeek (){
        Date date = new Date();
        String dayOfWeek = new String();
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");  
        try {
             date = formatter.parse(startDate);
        } catch (ParseException ex) {
            System.out.println("Incorrect date format");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        dayOfWeek = simpleDateFormat.format(date);
        return dayOfWeek;
        
    }
    public int numericalDayOfWeek(){
        Date date = new Date();
        int day = 0;
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");  
        try {
             date = formatter.parse(startDate);
        } catch (ParseException ex) {
            System.out.println("Incorrect date format numerical");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        day = calendar.get(Calendar.DAY_OF_WEEK);
        return day;
        
        
        
    }
    
}
