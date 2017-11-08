package entity;

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
    
}
